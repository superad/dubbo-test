package com.bestpay.test.provider.billcenter.impl;

import com.bestpay.cf.commonservice.interfaze.bean.Response;
import com.bestpay.cf.commonservice.interfaze.bean.sequence.SeqNoReqBean;
import com.bestpay.cf.commonservice.interfaze.bean.sequence.SeqNoRspBean;
import com.bestpay.cf.commonservice.interfaze.service.SeqNoService;
import com.bestpay.test.provider.billcenter.util.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * Created by fgm on 2016/6/3.
 */
@Slf4j
@Service
public class SeqServiceImpl implements SeqNoService {
    public Response<SeqNoRspBean> getSeqNo(SeqNoReqBean seqNoReqBean) {
        log.info("CommonServiceImpl invoke success!");
        Response response=new Response(true);
        SeqNoRspBean seqNoRspBean=new SeqNoRspBean();
        //需要一个创造唯一序列的方法
        seqNoRspBean.setSeqNo("9999"+DateUtils.formatDate(new Date(),"yyyyMMddHHmmss"));
        seqNoRspBean.setCreateDate(new Date());
        response.setResult(seqNoRspBean);
        return response;
    }
}
