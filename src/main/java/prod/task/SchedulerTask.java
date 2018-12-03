package prod.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author changbingbing
 * 2018年12月3日
 */
@Component
public class SchedulerTask {

	private int count=0;

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }
    
    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
    
    // @Scheduled 参数可以接受两种定时的设置，一种是我们常用的cron="*/6 * * * * ?",一种是 fixedRate = 6000，两种都表示每隔六秒打印一下内容。
 	// @Scheduled(fixedRate = 6000) ：上一次开始执行时间点之后6秒再执行
 	// @Scheduled(fixedDelay = 6000) ：上一次执行完毕时间点之后6秒再执行
 	// @Scheduled(initialDelay=1000, fixedRate=6000) ：第一次延迟1秒后执行，之后按fixedRate的规则每6秒执行一次
}
