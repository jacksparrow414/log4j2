package com.example.log4j2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;

/**
 * @author jacksparrow414
 * @date 2022/11/15
 */
public class Log4j2ScriptTest {
    
    @Test
    public void assertScript() {
        String property = System.getProperty("os.name");
    }
    
    @Test
    public void assertRegex() {
        String content = "This is the text to be searched ";
        String pattern = "(?<abc>text)";
        // https://www.cnblogs.com/mengw/p/13531008.html
        boolean isMatch = Pattern.compile(pattern).matcher(content).find();
        // https://www.runoob.com/w3cnote/java-capture-group.html
        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(content);
        matcher.find();
        String group = matcher.group(0);
        System.out.println(group);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }
}
