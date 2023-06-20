package com.AExVeS.AExVeS.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.properties.SwaggerUiConfigParameters;
import org.springdoc.core.properties.SwaggerUiConfigProperties;
import org.springdoc.core.properties.SwaggerUiOAuthProperties;
import org.springdoc.core.providers.ObjectMapperProvider;
import org.springdoc.webmvc.ui.SwaggerIndexPageTransformer;
import org.springdoc.webmvc.ui.SwaggerIndexTransformer;
import org.springdoc.webmvc.ui.SwaggerWelcomeCommon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.resource.ResourceTransformerChain;
import org.springframework.web.servlet.resource.TransformedResource;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import jakarta.servlet.http.HttpServletRequest;

@OpenAPIDefinition(info = @Info(title = "AExVeS API", version = "1.0.0", description = "The api documentation for AExVeS Project"))
@Configuration
public class SpringDocConfig {
	private static class SwaggerCodeBlockTransformer extends SwaggerIndexPageTransformer {
		public SwaggerCodeBlockTransformer(SwaggerUiConfigProperties swaggerUiConfig,
				SwaggerUiOAuthProperties swaggerUiOAuthProperties, SwaggerUiConfigParameters swaggerUiConfigParameters,
				SwaggerWelcomeCommon swaggerWelcomeCommon, ObjectMapperProvider objectMapperProvider) {
			super(swaggerUiConfig, swaggerUiOAuthProperties, swaggerUiConfigParameters, swaggerWelcomeCommon,
					objectMapperProvider);
		}

		@Override
		public Resource transform(HttpServletRequest request, Resource resource, ResourceTransformerChain transformer)
				throws IOException {
			if (resource.toString().contains("custom-swagger.css")) {
				final InputStream is = resource.getInputStream();
				final InputStreamReader isr = new InputStreamReader(is);
				try (BufferedReader br = new BufferedReader(isr)) {
					final String css = br.lines().collect(Collectors.joining());
					final byte[] transformedContent = css.replace("swagger-ui.css", "custom-swagger.css").getBytes();
					return new TransformedResource(resource, transformedContent);
				}
			}
			return super.transform(request, resource, transformer);
		}
	}

	@Bean
	SwaggerIndexTransformer swaggerIndexTransformer(SwaggerUiConfigProperties a, SwaggerUiOAuthProperties b,
			SwaggerUiConfigParameters c, SwaggerWelcomeCommon d, ObjectMapperProvider e) {
		return new SwaggerCodeBlockTransformer(a, b, c, d, e);
	}

	@Bean
	GroupedOpenApi partnerApi() {
		String[] paths = { "/api/partners/**" };
		return GroupedOpenApi.builder().group("Partners").pathsToMatch(paths).build();
	}

	@Bean
	GroupedOpenApi partnerReprApi() {
		String[] paths = { "/api/partner_representatives/**" };
		return GroupedOpenApi.builder().group("Partner Representatives").pathsToMatch(paths).build();
	}

	@Bean
	GroupedOpenApi representationBodyApi() {
		String[] paths = { "/api/representation_bodies/**" };
		return GroupedOpenApi.builder().group("Representation Bodies").pathsToMatch(paths).build();
	}
}
