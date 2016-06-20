package com.bestpay.test.provider.billcenter.impl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by perdonare on 2016/4/11.
 */
public class GateWayPay extends HttpServlet {
    public static final String UTF8="UTF-8";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(UTF8);
        PrintWriter printWriter = resp.getWriter();
        Random random = new Random();
        int a = random.nextInt();
//        if (a%3==0) {
          //  printWriter.write("000000|成功|03310108045321000|2016040809293210408319|111111112233|2008||80F3CAC9FE4E01B49E58859E2337A71C");
//        } else if (a%3==1) {
          printWriter.write("006502|余额不足|03310108045321000|2016040809293210408319||2008||80F3CAC9FE4E01B49E58859E2337A71C");
//        } else {
//            printWriter.write("error");
//        }
        printWriter.close();
    }
}
