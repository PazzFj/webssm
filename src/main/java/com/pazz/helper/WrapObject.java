package com.pazz.helper;

import com.pazz.entity.Person;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: 彭坚
 * @create: 2019/4/8 19:59
 * @description:
 */
@Data
@Component
@Scope("singleton")
public class WrapObject {

    private static final Map<String, Object> map = new HashMap<>();

    static {
        map.put("data", new ArrayList<Person>());
    }

    public static Map<String, Object> getMap() {
        return map;
    }
}
