
// The IF statement runs code under it only when the condition of IF is true

// The brackets {} related to IF statement  hold the code under IF. 
public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 30;
		int dogs = 15;

		//if ( people < cats ) 
		//{
			//System.out.println( "Too many cats!  The world is doomed!" );
		//}
		
		// checking if value of 'people' is larger than that of 'cat'
		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}
		
		// checking if value of 'people' is smaller than that of 'dog'
		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		// checking if value of 'people' is larger than that of 'dog'
		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;
		
		// checking if value of 'people' is still larger than or equal that of 'dog' even after increment.
		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}
		
		// checking if value of 'people' is less than or equal that of 'dogs'

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		// checking if value of 'people' equals to that of 'dogs'
		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}