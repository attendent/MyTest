package Json;

import jdk.nashorn.internal.parser.JSONParser;
import net.sf.json.JSONObject;

import java.io.StringWriter;

public class JsonEncodeDemo {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("name","foo");
        obj.put("number",100);
        obj.put("balance",100.99);
        obj.put("is_vap",true);
        System.out.println();

        StringWriter out = new StringWriter();
        obj.write(out);
        String jsonText = out.toString();
        System.out.println(jsonText);
    }


}
