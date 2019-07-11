package com.iot.call.back;

/*
* 주문을 받는 클래스
* */
class Order {

    private ProductStore ps;
    public  Order(){
        ps = new ProductStore();
    }
    public void getOrder(String goods){
        ps.checkGoods(goods,this);
    }
    public  void resultMessage(String message){
        System.out.println(message);
    }

}
