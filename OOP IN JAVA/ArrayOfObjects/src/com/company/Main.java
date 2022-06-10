package com.company;

class Subject
{
    private String subjectID;

    private String subjectName;

    private short maxMarks;

    private short marksObtained;

    public void setMarksObtained(short marksObtained)
    {
        this.marksObtained = marksObtained;
    }

    public Subject(String subjectID, String subjectName, short maxMarks)
    {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.maxMarks = maxMarks;
    }

    public short getMaxMarks()
    {
        return maxMarks;
    }

    public short getMarksObtained()
    {
        return marksObtained;
    }

    public String getSubjectID()
    {
        return subjectID;
    }

    public String getSubjectName()
    {
        return subjectName;
    }

    public String toString()
    {
        return "\nDetails:" + "\nSubject ID = " + subjectID + "\nSubject Name = " + subjectName + "\nMarks Obtained = " + marksObtained;
    }


}

public class Main {

    public static void main(String[] args) {
        Subject sub[] = new Subject[3];
        sub[0] = new Subject("S100", "Data Structure", (short) 100);
        sub[1] = new Subject("S101" , "Theory OF Computation", (short) 100);
        sub[2] = new Subject("S102", "Network Thoery", (short) 100);

        for(Subject x:sub)
            System.out.println(x);

    }
}
