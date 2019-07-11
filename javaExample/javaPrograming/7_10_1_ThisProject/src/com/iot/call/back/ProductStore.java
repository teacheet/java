package com.iot.call.back;

/*
* 상품의 재고 현황을 나타내는 클래스
* */

class ProductStore {
    private String [] goodsNames;
    private int [] values;

    public ProductStore(){
        goodsNames = new String[3];
        values = new int[3];

        goodsNames[0] = "LG Gram Model 2017";
        goodsNames[1] = "LG Gram Model 2018";
        goodsNames[2] = "LG Gram Model 2019";

        values[0] = 3;
        values[1] = 2;
        values[2] = 0;
    }

    public  void checkGoods(String goods,Order order){
        boolean flag = false;
        for(int i = 0; i < goodsNames.length ; i++){
            if(goodsNames[i].equalsIgnoreCase(goods) && values[i]>0){
                values[i]--;
                flag = true;
                break;
            }
        }
        String resultMessage = "";
        if(flag){
            resultMessage = " 주문 가능 합니다.";
        }else{
            resultMessage = " 재고가 없어 2일후 주문 가능합니다.";
        }
        order.resultMessage(resultMessage);
    }
}
