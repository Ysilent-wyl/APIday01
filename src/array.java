import java.util.Calendar;
import java.util.Date;

public class array {
    public static void main(String[] args) {
//        long time = System.currentTimeMillis();
//        Date date = new Date(time);
//        System.out.println(date);
//        Calendar calendar = Calendar.getInstance();
//        System.out.println("年：" + calendar.get(Calendar.YEAR));
//        //月份从0开始计算
//        System.out.println("月：" + calendar.get(Calendar.MONTH));
//        System.out.println("日：" + calendar.get(Calendar.DATE));
        /*
        商品生产日期2021年3月13日
        保质期：48天
        过期前的一周周四是促销日，问促销日是哪一天
        https://github.com/Ysilent-wyl/APIday01.git

         */
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE,13);
        cal.add(Calendar.DATE,48);
        cal.add(Calendar.DATE,-7);
        cal.set(Calendar.DAY_OF_WEEK,5);
        Date time = cal.getTime();
        System.out.println(time);
    }
}
