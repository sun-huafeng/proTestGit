package pro1207;
import java.util.ArrayList;   
import java.util.List;   
import java.util.concurrent.*;   
  
public class CallableDemo{   
    public static void main(String[] args){   
        ExecutorService executorService = Executors.newCachedThreadPool();   
        List<Future<String>> resultList = new ArrayList<Future<String>>();   
  
        //����10������ִ��   
        for (int i = 0; i < 100; i++){   
            //ʹ��ExecutorServiceִ��Callable���͵����񣬲������������future������   
            Future<String> future = executorService.submit(new TaskWithResult(i,"name"));   
            //������ִ�н���洢��List��   
            resultList.add(future);   
        }   
  
        //��������Ľ��   
        for (Future<String> fs : resultList){   
                try{   
                    while(!fs.isDone());//Future�������û����ɣ���һֱѭ���ȴ���ֱ��Future�������  
                    System.out.println("���ͳɹ������� nameΪ"+fs.get());     //��ӡ�����̣߳�����ִ�еĽ��   
                    //���������ʷ��
                }catch(InterruptedException e){   
                    e.printStackTrace();   
                }catch(ExecutionException e){   
                    e.printStackTrace();   
                }finally{   
                    //����һ��˳��رգ�ִ����ǰ�ύ�����񣬵�������������  
                    executorService.shutdown();   
                }   
        }   
    }   
}   
  
  
class TaskWithResult implements Callable<String>{   
    private int id;  
    private String name; 
  
    public TaskWithResult(int id,String name){   
        this.id = id;   
        this.name = name; 
    }   
  
    /**  
     * ����ľ�����̣�һ�����񴫸�ExecutorService��submit������ 
     * ��÷����Զ���һ���߳���ִ�� 
     */   
    public String call() throws Exception {  
        System.out.println("��ʼ����"+name+"---"+id);   
        //�÷��ؽ������Future��get�����õ�  
        return name+"---"+id;
        //return "call()�������Զ����ã����񷵻صĽ���ǣ�" + id +name+ "    " + Thread.currentThread().getName();   
    }   
}