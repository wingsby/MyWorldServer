package net.wingsby.myworld.server;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.apache.log4j.Logger;

/**
 * Created by wingsby on 2018/4/16.
 */
@RestController
public class AviationMeterologyController {
    private static final Logger logger = LoggerFactory.getLogger(AviationMeterologyController.class);
    private static final long expireTime = 3600 * 1000l;
    private static Map<String, Object> tokenMap = new HashMap<>();



    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public JSONObject test(HttpServletRequest request) {
        Map<String, String[]> parameters = request.getParameterMap();
        String parstr = "?";
        for (String str : parameters.keySet()) {
            if (parameters.get(str) != null && parameters.get(str).length > 0) {
                parstr += (str + "=" + parameters.get(str)[0] + "&");
            }
        }
        // post数据
//        String url = "http://ocean-gateway/nwpc/point" + parstr;
//        ResponseEntity<JSONObject> response = service.restTemplate.getForEntity(url, JSONObject.class);
//        JSONObject resVal = response.getBody();
        return null;
    }




}
