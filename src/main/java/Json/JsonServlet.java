package Json;

import net.sf.json.JSONObject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/json")
public class JsonServlet extends HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String user = "{\"user\":\"1213018820\"}";
        System.out.println("开始啦");
        //String user = request.getParameter("user");

        System.out.println(user);
        //JSONObject json = new JSONObject.fromObject(user);
        //json.getString("name");

        JSONObject json = JSONObject.fromObject(user);
        System.out.println(json.toString());
        /*json.put("name", "张静婷");
        json.put("value","190");*/

        PrintWriter out = response.getWriter();
        out.println(json);
        //response.getWriter().write(json.toString());


    }
}
