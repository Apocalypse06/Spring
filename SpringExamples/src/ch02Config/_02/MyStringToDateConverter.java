package ch02Config._02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
@Component
public class MyStringToDateConverter implements Converter<String, Date> {
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
			return sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return null;
    }
}