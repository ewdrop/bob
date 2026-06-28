package com.wwj.lianxi.repair;

public class Find {
    /**ArrayList<RepairOrder> orderCollects = new ArrayList<>();
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
     System.out.println(getById(transListToMap(orderCollects),1111L));
     } catch (Exception e) {
     e.printStackTrace();
     }
     System.out.println("-------------根据状态统计次数----------");
     System.out.println(countByStatus(orderCollects,"待受理"));
     System.out.println(saveToFile(orderCollects,"D://bob//a.txt"));
     try{
     List<RepairOrder> loaded = loadFromFile("D:/bob/a.txt");
     printAll(loaded);
     } catch (IOException e) {
     System.out.println(e.getMessage());
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
     static RepairOrder getById(HashMap<Long,RepairOrder> map, Long id){
     if (!map.containsKey(id)){
     throw new IllegalArgumentException("报修单不存在");
     }
     return map.get(id);
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

     static boolean saveToFile(List<RepairOrder> list, String path){
     boolean isSaved = true;
     List<String> lines = new ArrayList<>();
     for (RepairOrder order : list) {
     String line = order.getId()+","+order.getDescription()+","+order.getStatus();
     lines.add(line);
     }
     Path filePath = Paths.get(path);
     try{
     Files.write(filePath, lines);
     }catch (IOException e) {
     isSaved = false;
     }
     return isSaved;
     }

     static List<RepairOrder> loadFromFile(String path) throws IOException {
     List<RepairOrder> result = new ArrayList<>();
     Path filePath = Paths.get(path);
     //文件不存在 返回空列表
     if (!Files.exists(filePath)){
     return result;
     }

     List<String> lines = Files.readAllLines(filePath);
     for (int i = 0; i < lines.size(); i++) {
     String line = lines.get(i).trim();
     //跳过空行
     if (line.isEmpty()){
     continue;
     }
     String[] parts = line.split(",");
     //格式不对跳过
     if (parts.length != 3){
     System.out.println("第"+(i+1)+"行错误："+line);
     continue;
     }
     Long id = Long.parseLong(parts[0]);
     String dese = parts[1];
     String status = parts[2];
     result.add(new RepairOrder(id, dese, status));
     }
     return result;
     }
     */
}
