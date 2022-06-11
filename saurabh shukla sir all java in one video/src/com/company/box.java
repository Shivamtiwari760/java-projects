package com.company;

public class box {
    private int length, breadth, height;

    public void setdimension(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }
        public void showdimension()
        {
            System.out.println("l+" + length);
            System.out.println("b+" + breadth);
            System.out.println("h+" + height);
        }
    }
    class example{
        public static void main(String[] args) {
            box smallbox=new box();
            smallbox.setdimension(12,10,99);
            smallbox.showdimension();
            smallbox=new box();
            smallbox.showdimension();
        }
    }

