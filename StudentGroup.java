import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		for(int i=0;i<Student.length;i++)
		{
		return Student[i];
		}
        // Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
             try{

                for(int i=0;i<Student.length;i++)
		{
		this.students=student[i];
		}
		}catch(IllegalArgumentException e)
		{
		e.printStackTrace();
		}

		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {

if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length <= 0 )
{
throw new IllegalArgumentException();
}
else
this.students=students[index];
	
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudent(Student student, int index) {
		

if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length <= 0 )
{
throw new IllegalArgumentException();
}
else
this.students=student[index];


		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
/**
	 * Inserts the specified element at the beginning of this array if student
	 * == null method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the element to add
	 * 
	 * @throws IllegalArgumentException
	 */
if(student == NULL)
{
throw new IllegalArgumentException();
}
else
this.students[-1]=student;
		
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {

	/**
	 * Appends the specified element to the end of this array. if student ==
	 * null method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the element to add
	 * 
	 * @throws IllegalArgumentException
	 */
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length <= 0 )
{
throw new IllegalArgumentException();
}
else

this.student=student;


		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length <= 0 )
{
throw new IllegalArgumentException();
}
else
{
this.student=student[index];
}

	}

	@Override
	public void remove(int index) {
		// Add your implementation here
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}
else
this.student[index]=NULL;



		// Add your implementation here
	}

	@Override
	public void remove(Student student) {if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}else

		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}else
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}else
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}else
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}else
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}else 
        int n = students.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(students[j-1] > students[j]){  
                                  
                                 temp = arr[j-1];  
                                 students[j-1] = students[j];  
                                 students[j] = temp;  
                         }  
                          
                 }  
         }  
  
   
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}else

        SimpleDateFormat formatter = new SimpleDateFormat(BirthDate);
//String[] date1 = BirthDate.split("/");

String bdate=students.getBirthDate();
if(bdate.equals(date))
{
	return students;
}

		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here

        
formatter = new SimpleDateFormat(birthDate);
Date  startDate = (Date)formatter.parse(firstDate); 
Date  endDate = (Date)formatter.parse(lastdate);
long interval = 24*1000 * 60 * 60; 
long endday =endDate.getDay() ; 
long curday = startDate.getDay();
while (curday <= endday) {
    dates.add(new Date(curday));
    curday += interval;
}
for(int i=0;i<dates.size();i++){
    Date lDate =(Date)dates.get(i);
    String ds = formatter.format(lDate);    
    System.out.println(" Date is ..." + ds);
}

		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}else

		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}else

		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}else

		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}
else

		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
if(student==NULL)
{
throw new IllegalArgumentException();
}
else if(student.length == 0 )
{
throw new IllegalArgumentException("Student not exist");
}
else

		return null;
	}
}
