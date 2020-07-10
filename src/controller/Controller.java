package controller;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import service.ProductService;
import service.ProductServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args){
        ProductService productService=new ProductServiceImpl();
        Scanner scanner=new Scanner(System.in);
        while (true) {

            System.out.println("-------1.查询商品(查询所有商品,查询相关商品,查询促销商品)----");
            System.out.println("-------2.修改商品(修改商品价格,修改/增加商品促销日期)--------");
            System.out.println("-------3.删除商品（按商品编号删除）-------------------------");
            System.out.println("-------4.增加商品（增加商品,增加促销商品）------------------");
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("---------------1.查询所有商品-------------------------");
                System.out.println("---------------2.查询相关商品(商品编码，商品ID)--------");
                System.out.println("---------------3.查询促销商品-------------------------");
                a = scanner.nextInt();
                if (a == 1) {
                    try {
                        System.out.println(productService.findByAll());
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                } else if (a == 2) {
                    System.out.println("---------1.商品编号查询-------");
                    System.out.println("---------2.商品ID查询--------");
                    a=scanner.nextInt();
                    if (a==1){
                    try {
                        System.out.println("输入需要查询的商品编号：");
                        int suk = scanner.nextInt();
                        productService.findByProduct(suk);
                        if ( productService.findByProduct(suk).size()>0){
                        System.out.println(productService.findByProduct(suk));}else {
                            System.out.printf("不存在此商品！！");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }}else if (a==2){
                        try {
                            System.out.println("输入需要查询的商品ID：");
                            int proId = scanner.nextInt();
                            productService.findByProductIp(proId);
                            if ( productService.findByProductIp(proId).size()>0){
                                System.out.println(productService.findByProductIp(proId));}else {
                                System.out.printf("不存在此商品！！");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }


                    }else{System.out.printf("输入失败！！");}
                }else if (a==3){
                    try {
                        System.out.println( productService.findByOffer());
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
            }
            else if (a == 2) {
                System.out.println("-------1.修改商品价格------------");
                System.out.println("-------2.修改商品促销日期--------");
                a=scanner.nextInt();
                System.out.printf("输入修改商品商品编号：");
                int pro_id =scanner.nextInt();
                if (a==1){
                    try {
                        productService.updateByProduct(pro_id);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else if (a==2){
                    try {
                        productService.updateByOfferPrice(pro_id);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else { System.out.printf("输入有误！"); }
            } else if (a == 3) {
                System.out.println("输入需要删除的商品编号：");
                int pro_id = scanner.nextInt();
                try {
                    productService.deleteByOfferPrice(pro_id);
                    productService.deleteByProduct(pro_id);
                    System.out.printf("删除成功！！");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }else if (a==4) {
                try {
                    productService.findByAll();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                System.out.println("-------1.增加商品信息-----------");
                System.out.println("-------2.增加促销商品信息--------");
                a=scanner.nextInt();
                if(a==1){
                try {
                    productService.insertByProduct();
                } catch (SQLException e) {
                    e.printStackTrace();
                }}else  if (a==2){
                    try {
                        productService.insertByOdderPrice();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else {System.out.println("输入有误！！！");}
            }else
             {
                System.out.println("输入有误！！！");
            }
            System.out.println("按任意键+回车返回");
            scanner.next();
       /* System.out.println("-------1.修改商品价格--------");
        System.out.println("-------2.修改商品促销日期--------");*/


        }

    }
}
