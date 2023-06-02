const sidebarLinks = document.querySelectorAll("#sidebar a.nav-link");

const partners = document.querySelector("#partners");
const representatives = document.querySelector("#representatives");
const bodies = document.querySelector("#bodies");

const tables = [partners, representatives, bodies]

sidebarLinks.forEach(button => {
    button.addEventListener('click', () => {
        sidebarLinks.forEach(btn => {
            btn.classList.remove('active');
        });

        button.classList.add('active');

        tables.forEach((table, tableIndex) => {
            if (index === tableIndex) {
                table.classList.remove('visually-hidden');
            } else {
                table.classList.add('visually-hidden');
            }
        });
    });
});