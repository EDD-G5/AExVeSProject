package com.AExVeS.AExVeS.errors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CustomErrorController implements ErrorController {
	
	private final static Map<Integer, String> RESPONSE_MSGS = readStatusCodes();
	
	@RequestMapping("/error")
	public String showPageStatusDependingError(Exception e, HttpServletResponse resp, Model model) {
		String errorPage = "error";
		final int statusCode = resp.getStatus();

		if (!(statusCode >= 200 && statusCode < 300)) {
			model.addAttribute("stscode", statusCode);
			model.addAttribute("message", RESPONSE_MSGS.get(statusCode));
			model.addAttribute("exception", e.getClass());
			model.addAttribute("trace", e.getStackTrace());
		}
		return errorPage;
	}    

	private static Map<Integer, String> readStatusCodes() {
		Map<Integer, String> statusCodesMsgs = new HashMap<>();
		try (BufferedReader br = new BufferedReader(
				new FileReader("./src/main/resources/static/http_status_codes.csv"));) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				if (!values[0].contains("-") && !values[0].equals("code"))
					statusCodesMsgs.put(Integer.parseInt(values[0]), values[1]);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return statusCodesMsgs;
	}
}