package com.problemdiagonaldifference.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //Variables declarations
        int rows = 0;
        int number = 0;
        int result = 0;

        //List declaration
        List<List<Integer>> matrix = new ArrayList<>();

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Input numbers rows
        rows = in.nextInt();

        //Add numbers to list
        for(int i = 0; i < rows; i++)
        {
            //Create new array into list
            matrix.add(new ArrayList<Integer>());

            //Get and add number to list
            for(int j = 0; j < rows; j++)
            {
                number = in.nextInt();
                matrix.get(i).add(number);
            }
        }

        //output result
        result = diagonalDifference(matrix);
        System.out.println(result);
    }

    //Function
    public static int diagonalDifference(List<List<Integer>> matrix)
    {
        //Variables declaration
        int sumLtR = 0;
        int sumRtL = 0;

        //Process of sum diagonals
        for(int i = 0, j = matrix.size() - 1; i < matrix.size(); i++, j--)
        {
            //Sum left to right
            sumLtR += matrix.get(i).get(i);

            //Sum Right to left
            sumRtL += matrix.get(i).get(j);
        }

        //Subtraction of diagonals and get absolute
        return Math.abs(sumLtR - sumRtL);
    }
}
