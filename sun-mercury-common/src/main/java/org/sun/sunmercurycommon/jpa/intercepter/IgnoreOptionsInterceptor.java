package org.sun.sunmercurycommon.jpa.intercepter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.NamedThreadLocal;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.sun.sunmercurycommon.jpa.util.HttpUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by libin on 2015/5/13.
 */
@Component
public class IgnoreOptionsInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(IgnoreOptionsInterceptor.class);

    private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("StopWatch-StartTime");

    // 忽略options请求，默认为true
    private boolean ignoreOptions = true;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        startTimeThreadLocal.set(System.currentTimeMillis());//线程绑定变量（该数据只有当前请求的线程可见）
        if (ignoreOptions && HttpMethod.OPTIONS.matches(request.getMethod())) {
            logger.info("OPTIONS Ignored, return 200");
            response.setStatus(HttpStatus.OK.value());
            HttpUtil.ok(request, response);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }


   }
