/**
 * 
 */
package org.jretty.tesper;

/**
 * 
 * @author zollty
 * @since 2019年6月10日
 */
public class LoopExecuteTest {
    
    public static void loopExecute1() throws Exception  {
        final int n = 10;
        TestTools.loopExecute(new LoopExecute() {
            @Override
            public int getLoopTimes() {
                return n;
            }

            @Override
            public void execute() throws Exception {
                int a = 0;
                if (a > 0) {
                    a++;
                }
            }
        }, "toStringArray.1");
    }
    
    public static void loopExecute3() throws Exception  {
        final int n = 10;
        TestTools.loopExecute(new LoopExecute(n) {
            @Override
            public void execute() throws Exception {
                int a = 0;
                if (a > 0) {
                    a++;
                }
            }
        }, "toStringArray.3");
    }

    public static void main(String[] args) {
        try {
            loopExecute1();
            
            loopExecute3();
            
            final int n = 10;
            TestTools.loopExecute(new LoopExecute() {
                @Override
                public int getLoopTimes() {
                    return n;
                }

                @Override
                public void execute() throws Exception {
                    int a = 0;
                    if (a > 0) {
                        a++;
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
