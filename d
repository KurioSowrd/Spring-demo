[33mcommit f1531408809179816f6af13d5101ea8438054038[m[33m ([m[1;36mHEAD -> [m[1;32mmaster[m[33m, [m[1;31morigin/master[m[33m)[m
Author: KurioSowrd <381709233@qq.com>
Date:   Sun Oct 6 05:53:22 2019 +0800

    2019-10-6

[1mdiff --git a/H2/MyblogUserDataBase.mv.db b/H2/MyblogUserDataBase.mv.db[m
[1mindex f1a397c..2241286 100644[m
Binary files a/H2/MyblogUserDataBase.mv.db and b/H2/MyblogUserDataBase.mv.db differ
[1mdiff --git a/H2/MyblogUserDataBase.trace.db b/H2/MyblogUserDataBase.trace.db[m
[1mindex 2e3d798..49311d4 100644[m
[1m--- a/H2/MyblogUserDataBase.trace.db[m
[1m+++ b/H2/MyblogUserDataBase.trace.db[m
[36m@@ -4342,3 +4342,4285 @@[m [mselect[m
 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)[m
 	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)[m
 	at java.lang.Thread.run(Thread.java:748)[m
[32m+[m[32m2019-09-28 19:22:22 jdbc[3]: exception[m
[32m+[m[32mjava.sql.SQLClientInfoException: Client info name 'ApplicationName' not supported.[m
[32m+[m	[32mat org.h2.jdbc.JdbcConnection.setClientInfo(JdbcConnection.java:1740)[m
[32m+[m	[32mat com.intellij.database.remote.jdbc.impl.RemoteConnectionImpl.setClientInfo(RemoteConnectionImpl.java:473)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)[m
[32m+[m	[32mat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)[m
[32m+[m	[32mat java.lang.reflect.Method.invoke(Method.java:498)[m
[32m+[m	[32mat sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:200)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:197)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.Transport.serviceCall(Transport.java:196)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)[m
[32m+[m	[32mat java.lang.Thread.run(Thread.java:745)[m
[32m+[m[32m2019-09-28 19:45:56 jdbc[3]: exception[m
[32m+[m[32mjava.sql.SQLClientInfoException: Client info name 'ApplicationName' not supported.[m
[32m+[m	[32mat org.h2.jdbc.JdbcConnection.setClientInfo(JdbcConnection.java:1740)[m
[32m+[m	[32mat com.intellij.database.remote.jdbc.impl.RemoteConnectionImpl.setClientInfo(RemoteConnectionImpl.java:473)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)[m
[32m+[m	[32mat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)[m
[32m+[m	[32mat java.lang.reflect.Method.invoke(Method.java:498)[m
[32m+[m	[32mat sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:200)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:197)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.Transport.serviceCall(Transport.java:196)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)[m
[32m+[m	[32mat java.lang.Thread.run(Thread.java:745)[m
[32m+[m[32m2019-09-30 19:41:01 jdbc[3]: exception[m
[32m+[m[32mjava.sql.SQLClientInfoException: Client info name 'ApplicationName' not supported.[m
[32m+[m	[32mat org.h2.jdbc.JdbcConnection.setClientInfo(JdbcConnection.java:1740)[m
[32m+[m	[32mat com.intellij.database.remote.jdbc.impl.RemoteConnectionImpl.setClientInfo(RemoteConnectionImpl.java:473)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)[m
[32m+[m	[32mat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)[m
[32m+[m	[32mat java.lang.reflect.Method.invoke(Method.java:498)[m
[32m+[m	[32mat sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:200)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:197)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.Transport.serviceCall(Transport.java:196)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)[m
[32m+[m	[32mat java.lang.Thread.run(Thread.java:745)[m
[32m+[m[32m2019-09-30 19:41:01 jdbc[3]: exception[m
[32m+[m[32morg.h2.jdbc.JdbcSQLException: Feature not supported: "getFunctions" [50100-196][m
[32m+[m	[32mat org.h2.message.DbException.getJdbcSQLException(DbException.java:345)[m
[32m+[m	[32mat org.h2.message.DbException.get(DbException.java:179)[m
[32m+[m	[32mat org.h2.message.DbException.get(DbException.java:155)[m
[32m+[m	[32mat org.h2.message.DbException.getUnsupportedException(DbException.java:216)[m
[32m+[m	[32mat org.h2.message.TraceObject.unsupported(TraceObject.java:374)[m
[32m+[m	[32mat org.h2.jdbc.JdbcDatabaseMetaData.getFunctions(JdbcDatabaseMetaData.java:3134)[m
[32m+[m	[32mat com.intellij.database.remote.jdbc.impl.RemoteDatabaseMetaDataImpl.getFunctions(RemoteDatabaseMetaDataImpl.java:565)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)[m
[32m+[m	[32mat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)[m
[32m+[m	[32mat java.lang.reflect.Method.invoke(Method.java:498)[m
[32m+[m	[32mat sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:200)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:197)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.Transport.serviceCall(Transport.java:196)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)[m
[32m+[m	[32mat java.lang.Thread.run(Thread.java:745)[m
[32m+[m[32m2019-09-30 19:41:01 jdbc[3]: exception[m
[32m+[m[32morg.h2.jdbc.JdbcSQLException: Feature not supported: "getFunctionColumns" [50100-196][m
[32m+[m	[32mat org.h2.message.DbException.getJdbcSQLException(DbException.java:345)[m
[32m+[m	[32mat org.h2.message.DbException.get(DbException.java:179)[m
[32m+[m	[32mat org.h2.message.DbException.get(DbException.java:155)[m
[32m+[m	[32mat org.h2.message.DbException.getUnsupportedException(DbException.java:216)[m
[32m+[m	[32mat org.h2.message.TraceObject.unsupported(TraceObject.java:374)[m
[32m+[m	[32mat org.h2.jdbc.JdbcDatabaseMetaData.getFunctionColumns(JdbcDatabaseMetaData.java:3125)[m
[32m+[m	[32mat com.intellij.database.remote.jdbc.impl.RemoteDatabaseMetaDataImpl.getFunctionColumns(RemoteDatabaseMetaDataImpl.java:537)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)[m
[32m+[m	[32mat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)[m
[32m+[m	[32mat java.lang.reflect.Method.invoke(Method.java:498)[m
[32m+[m	[32mat sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:200)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:197)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.Transport.serviceCall(Transport.java:196)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)[m
[32m+[m	[32mat java.lang.Thread.run(Thread.java:745)[m
[32m+[m[32m2019-09-30 20:16:38 jdbc[3]: exception[m
[32m+[m[32mjava.sql.SQLClientInfoException: Client info name 'ApplicationName' not supported.[m
[32m+[m	[32mat org.h2.jdbc.JdbcConnection.setClientInfo(JdbcConnection.java:1740)[m
[32m+[m	[32mat com.intellij.database.remote.jdbc.impl.RemoteConnectionImpl.setClientInfo(RemoteConnectionImpl.java:473)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)[m
[32m+[m	[32mat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)[m
[32m+[m	[32mat java.lang.reflect.Method.invoke(Method.java:498)[m
[32m+[m	[32mat sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:200)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:197)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.Transport.serviceCall(Transport.java:196)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)[m
[32m+[m	[32mat java.lang.Thread.run(Thread.java:745)[m
[32m+[m[32m2019-09-30 20:16:38 jdbc[3]: exception[m
[32m+[m[32morg.h2.jdbc.JdbcSQLException: Feature not supported: "getFunctions" [50100-196][m
[32m+[m	[32mat org.h2.message.DbException.getJdbcSQLException(DbException.java:345)[m
[32m+[m	[32mat org.h2.message.DbException.get(DbException.java:179)[m
[32m+[m	[32mat org.h2.message.DbException.get(DbException.java:155)[m
[32m+[m	[32mat org.h2.message.DbException.getUnsupportedException(DbException.java:216)[m
[32m+[m	[32mat org.h2.message.TraceObject.unsupported(TraceObject.java:374)[m
[32m+[m	[32mat org.h2.jdbc.JdbcDatabaseMetaData.getFunctions(JdbcDatabaseMetaData.java:3134)[m
[32m+[m	[32mat com.intellij.database.remote.jdbc.impl.RemoteDatabaseMetaDataImpl.getFunctions(RemoteDatabaseMetaDataImpl.java:565)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)[m
[32m+[m	[32mat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)[m
[32m+[m	[32mat java.lang.reflect.Method.invoke(Method.java:498)[m
[32m+[m	[32mat sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:200)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:197)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.Transport.serviceCall(Transport.java:196)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)[m
[32m+[m	[32mat java.lang.Thread.run(Thread.java:745)[m
[32m+[m[32m2019-09-30 20:16:38 jdbc[3]: exception[m
[32m+[m[32morg.h2.jdbc.JdbcSQLException: Feature not supported: "getFunctionColumns" [50100-196][m
[32m+[m	[32mat org.h2.message.DbException.getJdbcSQLException(DbException.java:345)[m
[32m+[m	[32mat org.h2.message.DbException.get(DbException.java:179)[m
[32m+[m	[32mat org.h2.message.DbException.get(DbException.java:155)[m
[32m+[m	[32mat org.h2.message.DbException.getUnsupportedException(DbException.java:216)[m
[32m+[m	[32mat org.h2.message.TraceObject.unsupported(TraceObject.java:374)[m
[32m+[m	[32mat org.h2.jdbc.JdbcDatabaseMetaData.getFunctionColumns(JdbcDatabaseMetaData.java:3125)[m
[32m+[m	[32mat com.intellij.database.remote.jdbc.impl.RemoteDatabaseMetaDataImpl.getFunctionColumns(RemoteDatabaseMetaDataImpl.java:537)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)[m
[32m+[m	[32mat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)[m
[32m+[m	[32mat java.lang.reflect.Method.invoke(Method.java:498)[m
[32m+[m	[32mat sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:200)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:197)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.Transport.serviceCall(Transport.java:196)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)[m
[32m+[m	[32mat java.lang.Thread.run(Thread.java:745)[m
[32m+[m[32m2019-10-02 23:09:15 jdbc[3]: exception[m
[32m+[m[32mjava.sql.SQLClientInfoException: Client info name 'ApplicationName' not supported.[m
[32m+[m	[32mat org.h2.jdbc.JdbcConnection.setClientInfo(JdbcConnection.java:1740)[m
[32m+[m	[32mat com.intellij.database.remote.jdbc.impl.RemoteConnectionImpl.setClientInfo(RemoteConnectionImpl.java:473)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)[m
[32m+[m	[32mat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)[m
[32m+[m	[32mat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)[m
[32m+[m	[32mat java.lang.reflect.Method.invoke(Method.java:498)[m
[32m+[m	[32mat sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:200)[m
[32m+[m	[32mat sun.rmi.transport.Transport$1.run(Transport.java:197)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.Transport.serviceCall(Transport.java:196)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)[m
[32m+[m	[32mat java.security.AccessController.doPrivileged(Native Method)[m
[32m+[m	[32mat sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)[m
[32m+[m	[32mat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)[m
[32m+[m	[32mat java.lang.Thread.run(Thread.java:745)[m
[32m+[m[32m2019-10-03 07:18:11 database: flush[m
[32m+[m[32morg.h2.message.DbException: General error: "java.lang.IllegalStateException: The file is locked: nio:G:/demo12/H2/MyblogUserDataBase.mv.db [1.4.199/7]" [50000-199][m
[32m+[m	[32mat org.h2.message.DbException.get(DbException.java:194)[m
[32m+[m	[32mat org.h2.message.DbException.convert(DbException.java:347)[m
[32m+[m	[32mat org.h2.mvstore.db.MVTableEngine$1.uncaughtException(MVTableEngine.java:90)[m
[32m+[m	[32mat org.h2.mvstore.MVStore.handleException(MVStore.java:2787)[m
[32m+[m	[32mat org.h2.mvstore.MVStore.panic(MVStore.java:441)[m
[32m+[m	[32mat org.h2.mvstore.MVStore.<init>(MVStore.java:404)[m
[32m+[m	[32mat org.h2.mvstore.MVStore$Builder.open(MVStore.java:3343)[m
[32m+[m	[32mat org.h2.mvstore.db.MVTableEngine$Store.open(MVTableEngine.java:162)[m
[32m+[m	[32mat org.h2.mvstore.db.MVTableEngine.init(MVTable