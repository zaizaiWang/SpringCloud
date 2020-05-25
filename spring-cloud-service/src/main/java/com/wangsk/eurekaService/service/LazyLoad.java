package com.wangsk.eurekaService.service;

public class LazyLoad {
    private LazyLoad(){

    }

    /**
     * 静态内部类实现懒加载
     */
//    private static class LazyLoagInner{
//        private  static LazyLoad lazyLoads = new LazyLoad();
//    }
//
//    public static  LazyLoad getInstances(){
//        return LazyLoagInner.lazyLoads;
//    }

    private volatile static LazyLoad lazyLoad;

    public LazyLoad getLazyLoad(){
        if(lazyLoad==null){
            synchronized (lazyLoad) {
                if (lazyLoad==null) {
                    lazyLoad = new LazyLoad();
                }
            }
        }
        return lazyLoad;
    }

}
