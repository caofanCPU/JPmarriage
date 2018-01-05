package Basic;


import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import java.util.Properties;

/**
 * Created by caofanCPU on 2018/1/5.
 */
public class JavaApplyPythonCodeTest
{

    public static void main(String[] args)
    {
        Properties props = new Properties();
        props.put("python.home", "path to the Lib folder");
        props.put("python.console.encoding", "UTF-8");
        props.put("python.security.respectJavaAccessibility", "false");
        props.put("python.import.site", "false");
        Properties properties = System.getProperties();

        PythonInterpreter.initialize(properties, props, new String[0]);
        // 开启Python解释器
        PythonInterpreter pythonInterpreter = new PythonInterpreter();
        // Java直接执行Python语句
        pythonInterpreter.exec("print 'Hello World!'");
//        // Java执行Python脚本
//        String basePath = JavaApplyPythonCodeTest.class.getResource("").getPath();
//        pythonInterpreter.execfile(basePath +"python_func.py");
//        // Java执行Python函数
//        PyFunction func = pythonInterpreter.get("add", PyFunction.class);
//        int a = 1, b =2;
//        PyObject pyobj = func.__call__(new PyInteger(a), new PyInteger(b));
//        System.out.println(pyobj.toString());
//        // 关闭Python解释器
        pythonInterpreter.close();
    }


}
