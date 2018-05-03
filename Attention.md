## Gradle3.0中compile变更为api和implementation

* 在com.android.tools.build:gradle 3.0以下版本依赖在gradle中的声明写法
```gradle
compile fileTree(dir: 'libs', include: ['*.jar'])
```

* 但在3.0后的写法为
```gradle
implementation fileTree(dir: 'libs', include: ['*.jar'])
api fileTree(dir: 'libs', include: ['*.jar'])
```

#### api指令

* 完全等同于compile指令，没区别，你将所有的compile改成api，完全没有错。 
#### implementation指令

* 这个指令的特点就是，对于使用了该命令编译的依赖，对该项目有依赖的项目将无法访问到使用该命令编译的依赖中的任何程序，也就是将该依赖隐藏在内部，而不对外部公开。 