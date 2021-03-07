spring Bean管理方式----基于注解----注入属性
1.使用@Qualifier注解
    目的在于区别同一接口下有多个实现类，根据类型就无法选择，从而出错！
2.@Resource：可以根据类型注入，也可以根据名称注入（它属于javax包下的注解，不推荐使用！）
3.@Value(value = "lhp")使用value完成属性注入
