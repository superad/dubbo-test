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
public class GateWayDeal extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        Random random = new Random();
        int a = random.nextInt();
//        if (a%3==0) {
            printWriter.write("00&");
//        } else if (a%3==1) {
//            printWriter.write("123&下单失败");
//        } else {
//            printWriter.write("error");
//        }
        printWriter.close();

    }
}
