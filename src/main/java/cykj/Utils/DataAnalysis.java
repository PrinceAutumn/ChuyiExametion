package cykj.Utils;


import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.*;
import java.util.ArrayList;

public class DataAnalysis<questions, Question> {
     public <Student> ArrayList<Student> getStudentData(String path) {
          ArrayList<Student> students = new ArrayList<Student>();
           try {
//             //获取excel文件
               File file = new File(path);
//             //转化成输入流
               InputStream input = new FileInputStream(file);
//             //创建Workbook对象
               Workbook workbook = Workbook.getWorkbook(input);
//             //获取第一张表（sheet1）
               Sheet readsheet = workbook.getSheet(0);
//             //获取sheet表中的总行数
               int rsRows = readsheet.getRows();
//             //获取sheet表中的总列数
               int rsColumns = readsheet.getColumns();
               System.out.println("总的行数：" + rsRows);
               System.out.println("总的列数：" + rsColumns);
             //创建集合把单元格中的数据存储起来
               ArrayList<String> list = new ArrayList<String>();//创建两个集合是希望按照行数进行存储
             ArrayList<String> list1 = new ArrayList<String>();//
//
              for (int i = 1; i < rsRows; i++) { //因为第一行是字段名称，所以此处从第二行开始取的数据

//                     Student student = new Student();
                       for (int j = 0; j < rsColumns; j++) {
                        Cell cell = readsheet.getCell(j, i);//获取当前表的单元格
                        String str = cell.getContents();//获取单元格中的数据
                            list.add(str);//把获取到的数据添加至集合中
                        System.out.println("第" + (i + 1) + "行" + "第" + (j + 1) + "列的值是：" + str);
                           Object student = null;
                           if (j == 0) {
            //        student.setaNum(str);
                   } else if (j == 1) {
//                         Object student = null;
//                         student.setsName(str);
                    } else if (j == 2) {
       //            student.setIdCard(str);
                    } else if (j == 3) {
          //             student.setExamNum(str);
                    } else if (j == 4) {
           //            student.setsSex(str);
                    } else if (j == 5) {
            //          student.setsAge(str);
                   }
              }
                  Student student1 = null;
                  students.add(student1);
                         list1.add(String.valueOf(list));//每读完一行则把该行的list数据集添加至另一个集合中。
            }
                System.out.println("单元格个数（list集合获取的总的数据个数）：" + list.size());
                 System.out.println("list:"  +  list1);
                 System.out.println("共取了 " +  list1.size() + " 行的数据集");
                 System.out.println("list1:" +  list1);
        } catch (Exception e) {
                e.printStackTrace();
           }
               return students;     }

//         public static <Exam, Question> Exam getExamData(String path) throws FileNotFoundException {
//           Exam exam = new Exam();              //获取excel文件
//try {
//}
 // String path;
 // File file = new File(path);
//            //转化成输入流
//       InputStream input = new FileInputStream(file);
//            //创建Workbook对象  Workbook workbook = Workbook.getWorkbook(input);
            //获取第一张表（sheet1）
             Workbook workbook;
             Sheet readsheet = workbook.getSheet(0);
            //获取sheet表中的总行数
            int rsRows = readsheet.getRows();
//            //获取sheet表中的总列数
            int rsColumns = readsheet.getColumns();
//          System.out.println("总的行数：" + rsRows);
    //     System.out.println("总的列数：" + rsColumns);
            //创建集合把单元格中的数据存储起来
           ArrayList<String> list = new ArrayList<String>();//创建两个集合是希望按照行数进行存储
//         for (int j = 0; j < rsColumns; j++) {
//                Cell cell = readsheet.getCell(j, 1);//获取当前表的单元格
//                String str = cell.getContents();//获取单元格中的数据
//               list.add(str);//把获取到的数据添加至集合中
//               System.out.println("第" + (1 + 1) + "行" + "第" + (j + 1) + "列的值是：" + str);
//                if (j == 0) {
////                  exam.seteNum(str);
//             } else if (j == 1) {
////                  exam.seteName(str);
//              } else if (j == 2) {
////                  exam.seteTime(str);
//               } else if (j == 3) {
////                    exam.seteType(str);
//                } else if (j == 4) {
////                    exam.seteWork(str);
//                } else if (j == 5) {
////                    exam.seteOrgan(str);
//                } else if (j == 6) {
////                    exam.seteLevel(str);
//                } else if (j == 7) {
////                    exam.seteScore(str);
//                } else if (j == 8) {
////                   exam.setmDescribe(str);
//                } else if (j == 9) {
////                  exam.setsDescribe(str);
//                } else if (j == 10) {
// //                 exam.setCourseId(str);
//               } else if (j == 11) {
// //                 exam.setcName(str);
                }

 //     } catch (Exception e) {
  //        e.printStackTrace();
//        }
  //    Object exam;

//    }

 // public ArrayList<Question> getQuestionData(String String path;path) {
//     ArrayList<Question> questions = new ArrayList<Question>();
//       try {
////            //获取excel文件
//       File file = new File(path);
//            //转化成输入流
//          InputStream input = new FileInputStream(file);
//           //创建Workbook对象
//       File input;
//         Workbook workbook = Workbook.getWorkbook(input);
//           //获取第一张表（sheet1）
//        Workbook workbook;
//        Sheet readsheet = workbook.getSheet(0);
//           //获取sheet表中的总行数
//          int rsRows = readsheet.getRows();
////            //获取sheet表中的总列数
//  //        int rsColumns = readsheet.getColumns();
//            System.out.println("总的行数：" + rsRows);
//            System.out.println("总的列数：" + rsColumns);
////
////            //创建集合把单元格中的数据存储起来
//  //        ArrayList<String> list = new ArrayList<String>();//创建两个集合是希望按照行数进行存储
//            ArrayList<String> list1 = new ArrayList<String>();//
////
//            for (int i = 3; i < rsRows; i++) { //因为第一行是字段名称，所以此处从第二行开始取的数据
/////               Question question = new Question();
//               for (int j = 0; j < rsColumns; j++) {
//                    Cell cell = readsheet.getCell(j, i);//获取当前表的单元格
//                    String str = cell.getContents();//获取单元格中的数据
//                    list.add(str);//把获取到的数据添加至集合中
//                    System.out.println("第" + (i + 1) + "行" + "第" + (j + 1) + "列的值是：" + str);
////
//                   Object question = null;
//                   if (j == 0) {
////                        question.setqType(str);
//                    } else if (j == 1) {
////                        question.setqNum(str);
//                    } else if (j == 2) {
////                        question.setqStem(str);
//                    } else if (j == 3) {
////                        question.setqOptionA(str);
//                    } else if (j == 4) {
////                        question.setqOptionB(str);
//                    } else if (j == 5) {
////                      question.setqOptionC(str);
//                    } else if (j == 6) {
// //                     question.setqOptionD(str);
//                    } else if (j == 7) {
//   //                   question.setqAnswer(str);
//                    } else if (j == 8) {
//   //                  question.setqScore(str);
//                  }
//               }
//                           Object question;
//
//    //          questions.add(question);
////              list1.add(String.valueOf  list);//每读完一行则把该行的list数据集添加至另一个集合中。
////            }
// //       ImageReader.Node list;
//            System.out.println("单元格个数（list集合获取的总的数据个数）：" + list.size());
//            System.out.println("list:" + list);
////             ImageReader.Node list1 = null;
//               System.out.println("共取了 " + list1.size() + " 行的数据集");
////             String list1 = null;
//               System.out.println("list1:" + list1);}
//          }  catch (Exception e) {
//                e.printStackTrace();
////        }
//          return questions;
//} catch (BiffException e) {
//               e.printStackTrace();
//           } catch (FileNotFoundException e) {
//               e.printStackTrace();
//           } catch (IOException e) {
//               e.printStackTrace();
//           } catch (BiffException e) {
//               e.printStackTrace();
//           } catch (FileNotFoundException e) {
//               e.printStackTrace();
//           } catch (IOException e) {
//               e.printStackTrace();
//           } catch (BiffException e) {
//               e.printStackTrace();
//           } catch (FileNotFoundException e) {
//               e.printStackTrace();
//           } catch (IOException e) {
//               e.printStackTrace();
