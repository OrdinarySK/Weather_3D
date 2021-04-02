//package com.springboot.springboot_demo.entity;
//
//import java.io.*;
//
//import static jdk.internal.util.xml.XMLStreamWriter.DEFAULT_ENCODING;
//
///**
// * @ClassName Write
// * @Description TODO
// * @Author luokai
// * @CreateDate 2020/10/20 20:03
// * @UPpdateUser luokai
// * @UpdateDate 2020/10/20 20:03
// * @UpdateRemark
// * @Version 1.0
// * Copyright (c) 2019,武汉中地云申科技有限公司
// * All rights reserved.
// **/
//public class Write {
//
//    public boolean ReadFile(){
//        String line = "";
//        String dir = "F:/气象数据1951-2010/";
//        File[] files = new File(dir).listFiles();
//
//        File file = new File("F:/气象数据1951-2010/");
//
//    }
//
//    public static  String readFile(String filePath) throws Exception {
//        File file=new File(filePath);
//        FileInputStream is=null;
//        is=new FileInputStream(file);
//        return  readInfoStream(is);
//    }
//
//    public static String readInfoStream(InputStream input) throws Exception {
//        if (input == null) {
//            throw new Exception("输入流为null");
//        }
//        //字节数组
//        byte[] bcache = new byte[2048];
//        int readSize = 0;//每次读取的字节长度
//        int totalSize = 0;//总字节长度
//        ByteArrayOutputStream infoStream = new ByteArrayOutputStream();
//        try {
//            //一次性读取2048字节
//            while ((readSize = input.read(bcache)) > 0) {
//                totalSize += readSize;
//                //将bcache中读取的input数据写入infoStream
//                infoStream.write(bcache, 0, readSize);
//            }
//        } catch (IOException e1) {
//            throw new Exception("输入流读取异常");
//        } finally {
//            try {
//                //输入流关闭
//                input.close();
//            } catch (IOException e) {
//                throw new Exception("输入流关闭异常");
//            }
//        }
//
//        try {
//            return infoStream.toString(DEFAULT_ENCODING);
//        } catch (UnsupportedEncodingException e) {
//            throw new Exception("输出异常");
//        }
//    }
//
////    public ArrayList<AdShow> getTxt(String filepath){
////        try{
////            String temp = null;
////            File f = new File(filepath);
////            String adn="";
////            //指定读取编码用于读取中文
////            InputStreamReader read = new InputStreamReader(new FileInputStream(f),"GBK");
////            ArrayList<String> readList = new ArrayList<String>();
////            ArrayList<AdShow> retList = new ArrayList<AdShow>();
////            BufferedReader reader=new BufferedReader(read);
////            //bufReader = new BufferedReader(new FileReader(filepath));
////            while((temp=reader.readLine())!=null &&!"".equals(temp)){
////                readList.add(temp);
////            }
////            read.close();
////            return retList;
////        }catch (Exception e) {
////            // TODO: handle exception
////            logger.info("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
////            e.printStackTrace();
////            return null;
////        }
//
//}
