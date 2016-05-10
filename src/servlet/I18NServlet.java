package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by OyDn on 2016/5/10.
 */
public class I18NServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        Locale locale = Locale.getDefault();
//        System.out.println(locale);
        Locale locale1 = request.getLocale();
        System.out.println(locale1);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Properties prop = new Properties();
        prop.load(this.getClass().getResourceAsStream("/aa_" + locale1.toString() +".properties"));
        out.println(prop.getProperty("aa"));
    }
}
