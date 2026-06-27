package com.wwj.lianxi;

/**
 * Hello world!
 *
 */
import com.wwj.lianxi.repair.RepairOrder;

import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayList<RepairOrder> orderCollects = new ArrayList<>();
        orderCollects.add(new RepairOrder(0L,"第一个报修","已完成"));
        orderCollects.add(new RepairOrder(11111L,"第二个报修","待受理"));
        orderCollects.add(new RepairOrder(22222L,"第三个报修","已分配"));
        orderCollects.add(new RepairOrder(33333L,"第四个报修","待受理"));
        orderCollects.add(new RepairOrder(44444L,"第五个报修","进行中"));
        printAll(orderCollects);
        System.out.println("=================================");
        List<RepairOrder> result = findByStatus(orderCollects,"待受理");
        printAll(result);
        System.out.println("---------根据id和哈希表查询----------");
        try{
            printAll(getById(transListToMap(orderCollects),1111L));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-------------根据状态统计次数----------");
        System.out.println(countByStatus(orderCollects,"待受理"));
    }
    //遍历打印
    static void printAll(List<RepairOrder> list){
        for (RepairOrder repairOrder : list) {
            System.out.println(repairOrder);
        }
    }
    //根据状态过滤
    static  List<RepairOrder> findByStatus(List<RepairOrder> list, String status){
        List<RepairOrder> result = new ArrayList<RepairOrder>();
        for (RepairOrder repairOrder : list) {
            if (status.equals(repairOrder.getStatus())){
                result.add(repairOrder);
            }
        }
        return result;
    }

    //把list转成map
    static HashMap<Long,RepairOrder> transListToMap(List<RepairOrder> list){
        HashMap<Long,RepairOrder> orderMap = new HashMap<>();
        for (RepairOrder repairOrder : list) {
            orderMap.put(repairOrder.getId(), repairOrder);
        }
        return orderMap;
    }
    static List<RepairOrder> getById(HashMap<Long,RepairOrder> map, Long id){
        if (!map.containsKey(id)){
            throw new IllegalArgumentException("报修单不存在");
        }
        List<RepairOrder> list =  new ArrayList<RepairOrder>();
        list.add(map.get(id));
        return list;
    }
    //根据状态统计次数
    static int countByStatus(List<RepairOrder> list, String status){
        List<RepairOrder> list1 = findByStatus(list, status);
        int count = 0;
        for (RepairOrder order : list1) {
            count++;
        }
        return count;
    }
}