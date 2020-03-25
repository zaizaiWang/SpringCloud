package com.wangsk.eurekaZuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

public class LoginFilter extends ZuulFilter {

    /**
     * 设置何时进行拦截，  pre:之前 routing：路由之时  post：路由之后  error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤顺序 数值越小，执行越靠前
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否需要过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 具体业务代码
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();//获取当前请求上下文
        HttpServletRequest request = requestContext.getRequest();//获取当前请求servlet
        String token = request.getParameter("token");
        if(token==null||"".equals(token)){

        }
        return null;
    }
}
