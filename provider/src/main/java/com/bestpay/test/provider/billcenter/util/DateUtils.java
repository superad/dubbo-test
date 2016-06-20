package com.bestpay.test.provider.billcenter.util;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by fgm on 2016/6/3.
 */
@Slf4j
public class DateUtils {


    public static String formatDate(Date date,String format){
        if(date==null){
            return "";
        }
        try{
            SimpleDateFormat sdf=new SimpleDateFormat(format);
            return sdf.format(date);
        }catch (Exception e){
           log.info("日期格式化错误");
            return "";
        }


    }

}
