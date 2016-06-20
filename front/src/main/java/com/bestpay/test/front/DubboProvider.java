package com.bestpay.test.front;

import com.bestpay.test.domain.Card;
import com.bestpay.test.domain.Response;
import com.bestpay.test.domain.User;

/**
 * Created by perdonare on 2015/12/1.
 */
public interface DubboProvider {
    Response<User> getUser(Card card );
}
