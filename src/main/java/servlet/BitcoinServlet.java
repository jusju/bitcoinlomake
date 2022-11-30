package servlet;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/arvonsyotto")
public class BitcoinServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// LOMAKKEELTA HAETUN TIEDON PROSESSOINTI
    	// TÄSSÄ VOISI TALLENTAA TIEDON MYÖS TIETOKANTAAN
    	String bitcoinArvoString = req.getParameter("bitcoinarvo");
    	System.out.println("ARVO NYT: " + bitcoinArvoString);
    	
    	req.setAttribute("bitcoinarvo", bitcoinArvoString);
    	
        // lähetä request edelleen index.jsp sivulle
        // lähetä request edelleen index.jsp sivulle
        req.getRequestDispatcher("/WEB-INF/bitcoinarvonnaytto.jsp").forward(req, resp);
    }
}