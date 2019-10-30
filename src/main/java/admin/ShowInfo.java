package admin;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ShowInfo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
        response.setContentType("text/html;charset=utf8");
        PrintWriter out = response.getWriter();
        String title = "test";
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><meta charset=\"utf-8\"><title>" + title + "</title></head>\n"+
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
                "<tr bgcolor=\"#949494\">\n" +
                "<th>Header 名称</th><th>Header 值</th>\n"+
                "</tr>\n");
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String param = (String)headerNames.nextElement();
            out.print("<tr><td>" + param + "</td>\n");
            String paramValue = request.getHeader(param);
            out.println("<td> " + paramValue + "</td></tr>\n");
        }
        out.println("</table>\n</body></html>");
        double a = 3.00-2.10;
        System.out.println(a);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException,IOException{
        doGet(request, response);
    }
}
