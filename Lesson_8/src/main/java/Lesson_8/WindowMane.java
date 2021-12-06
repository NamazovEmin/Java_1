package Lesson_8;


import org.apache.commons.lang3.ArrayUtils;
import javax.swing.*;
//ОБРАТИТЕ ВНИМАНИЕ!
// программа работает только с числами от 0 до 9, т.к. я хотел использовать метод Stringbuilder.
// Хотелось бы узнать каким образом(по какой логике, алгоритму) можно было реализовать проще и короче.

public class WindowMane extends JFrame {
    private String text;
    public WindowMane (){
        setTitle("Калькулятор");
        setBounds(0,0,400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(20,180,360,20);
        add(textArea);
        JButton button = new JButton("Рассчитать");
        add(button);
        button.setBounds(150,300,100,50);
        setLayout(null);
        setVisible(true);
        button.addActionListener(e -> {
            text = textArea.getText();
         StringBuilder builder = new StringBuilder(text);
            StringBuilder stack = new StringBuilder();
            String temp[] = new String[40];
            int flag = -1;
            for (int i = 0; i < builder.length(); i++){// удалим все не нужные пробелы
                    if (builder.charAt(i) == ' '){
                        builder.deleteCharAt(i);
                    }
                }
            System.out.println(builder);
            for (int i = 0; i < builder.length(); i++){
                switch (builder.charAt(i)) {
                    case ('+'):
                    case ('-'):
                        boolean memory = true;
                        if (stack.length() != 0) {
                            while (memory){
                                if (flag > 0){
                                    switch (stack.charAt(stack.length() - 1)) {
                                        case ('+') -> {
                                            temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) + Integer.parseInt(temp[flag]));
                                            temp = ArrayUtils.remove(temp, flag);
                                            stack.delete(stack.length() - 1, stack.length());
                                            flag--;
                                            System.out.println(flag);
                                        }
                                        case ('-') -> {
                                            temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) - Integer.parseInt(temp[flag]));
                                            temp = ArrayUtils.remove(temp, flag);
                                            stack.delete(stack.length() - 1, stack.length());
                                            flag--;
                                            System.out.println(flag);
                                        }
                                        case ('/') -> {
                                            temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) / Integer.parseInt(temp[flag]));
                                            temp = ArrayUtils.remove(temp, flag);
                                            stack.delete(stack.length() - 1, stack.length());
                                            flag--;
                                            System.out.println(flag);
                                        }
                                        case ('*') -> {
                                            temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) * Integer.parseInt(temp[flag]));
                                            temp = ArrayUtils.remove(temp, flag);
                                            stack.delete(stack.length() - 1, stack.length());
                                            flag--;
                                            System.out.println(flag);
                                        }
                                        default -> {
                                            stack.append(builder.charAt(i));
                                            memory = false;
                                        }
                                    }
                            }else{
                                    memory = false;
                                    stack.append(builder.charAt(i));
                                }
                            }

                        }else{
                            stack.append(builder.charAt(i));
                        }
                        break;
                    case ('/'):
                    case ('*'):
                        if (stack.length() != 0) {
                            switch (stack.charAt(stack.length() - 1)) {
                                case ('*') -> {
                                    temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) * Integer.parseInt(temp[flag]));
                                    temp = ArrayUtils.remove(temp, flag);
                                    stack.delete(stack.length() - 1, stack.length());
                                    stack.append(builder.charAt(i));
                                    flag--;
                                }
                                case ('/') -> {
                                    temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) / Integer.parseInt(temp[flag]));
                                    temp = ArrayUtils.remove(temp, flag);
                                    stack.delete(stack.length() - 1, stack.length());
                                    stack.append(builder.charAt(i));
                                    flag--;
                                }
                                default -> stack.append(builder.charAt(i));
                            }
                        }else{
                            stack.append(builder.charAt(i));
                        }
                        break;
                    case ('('):
                        stack.append(builder.charAt(i));
                        break;
                    case (')'):
                        memory = true;
                        while (memory){
                            if (stack.charAt(stack.length()-1) != '(' && flag > 0) {
                                switch (stack.charAt(stack.length() - 1)) {
                                    case ('+') -> {
                                        temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) + Integer.parseInt(temp[flag]));
                                        temp = ArrayUtils.remove(temp, flag);
                                        stack.delete(stack.length() - 1, stack.length());
                                        flag--;
                                        System.out.println(flag);
                                    }
                                    case ('-') -> {
                                        temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) - Integer.parseInt(temp[flag]));
                                        temp = ArrayUtils.remove(temp, flag);
                                        stack.delete(stack.length() - 1, stack.length());
                                        flag--;
                                        System.out.println(flag);
                                    }
                                    case ('/') -> {
                                        temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) / Integer.parseInt(temp[flag]));
                                        temp = ArrayUtils.remove(temp, flag);
                                        stack.delete(stack.length() - 1, stack.length());
                                        flag--;
                                        System.out.println(flag);
                                    }
                                    case ('*') -> {
                                        temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) * Integer.parseInt(temp[flag]));
                                        temp = ArrayUtils.remove(temp, flag);
                                        stack.delete(stack.length() - 1, stack.length());
                                        flag--;
                                        System.out.println(flag);
                                    }
                                    default -> memory = false;
                                }
                            }else{
                                stack.delete(stack.length() - 1, stack.length());
                                System.out.println( "Длина стека = " +  stack.length());
                                memory = false;
                            }
                        }
                        break;
                    default:

                        flag++;
                        temp[flag] = String.valueOf(builder.charAt(i));
                        System.out.println(flag);
                        break;

                }
            }
            while (stack.length() >0){
                switch (stack.charAt(stack.length() - 1)) {
                    case ('+') -> {
                        temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) + Integer.parseInt(temp[flag]));
                        temp = ArrayUtils.remove(temp, flag);
                        stack.delete(stack.length() - 1, stack.length());
                        flag--;
                        System.out.println(flag);
                    }
                    case ('-') -> {
                        temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) - Integer.parseInt(temp[flag]));
                        temp = ArrayUtils.remove(temp, flag);
                        stack.delete(stack.length() - 1, stack.length());
                        flag--;
                        System.out.println(flag);
                    }
                    case ('/') -> {
                        temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) / Integer.parseInt(temp[flag]));
                        temp = ArrayUtils.remove(temp, flag);
                        stack.delete(stack.length() - 1, stack.length());
                        flag--;
                        System.out.println(flag);
                    }
                    case ('*') -> {
                        temp[flag - 1] = Integer.toString(Integer.parseInt(temp[flag - 1]) * Integer.parseInt(temp[flag]));
                        temp = ArrayUtils.remove(temp, flag);
                        stack.delete(stack.length() - 1, stack.length());
                        flag--;
                        System.out.println(flag);
                    }
                }
            }
            System.out.println(flag);
            System.out.println(builder);
            for (int i = 0; i <= flag; i++){
                System.out.print(temp[i]);
            }
            System.out.println();
            System.out.println(stack);


        });

    }
    public static void main(String[] args) {
       new WindowMane();

    }
}
