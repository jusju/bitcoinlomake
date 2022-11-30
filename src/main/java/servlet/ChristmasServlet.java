package servlet;

import java.io.IOException;
import java.time.LocalTime;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static java.time.temporal.ChronoUnit.DAYS;

// ANNOTAATIOLLA @WEBSERVLET KERROTAAN, ETTÄ MISSÄ URL OSOITTEESSA
// OHJELMISTO ON
@WebServlet("/christmas")
public class ChristmasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TÄMÄN PÄIVÄN SELVITTÄMINEN LOCAL DATEN AVULLA
    	// EI KANNATA MUUTTAA STRINGIKSI, JOTTA VOI LASKEA
    	LocalDate paivamaaraNyt = LocalDate.now();
    	int vuosiNyt = paivamaaraNyt.getYear();
    	LocalDate jouluTanaVuonna = LocalDate.of(vuosiNyt, 12, 24);
        // TÄSSÄ KOHTAA PITÄISI OLLA JAVA-KOODI, JOKA SELVITTÄÄ MONTAKO
        // PÄIVÄÄ JOULUUN ON
    	long paiviaJouluun = DAYS.between(paivamaaraNyt, jouluTanaVuonna);
    	req.setAttribute("paiviaJouluun", paiviaJouluun);
        System.out.println("OLLAAN CHRISTMAS SERVLETISSÄ");
        // lähetä request edelleen index.jsp sivulle
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}
