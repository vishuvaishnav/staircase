#include <stdio.h>
#include <stdlib.h>

int top = -1;

void
push (int stack[], int size, int item)
{
  if (top == size - 1)
    {
      printf ("Overflow\n");
      exit (0);
    }
  else
    {
      top++;
      stack[top] = item;
    }
}

void
pop (int stack[], int size)
{
  if (top == -1)
    {
      printf ("underflow\n");
      exit (0);
    }
  else
    {
      printf ("%d\n", stack[top]);
      top--;
    }
}

void
show (int stack[])
{
  int i;
  if (top == -1)
    {
      printf ("[]\n");

    }
  else
    {
      for (i = 0; i <= top; i++)
	{
	  printf ("%d ", stack[i]);
	}
	printf("\n");
    }
}

void
peek (int stack[])
{
  if (top == -1)
    {
      printf ("[]\n");

    }
  else
    {
      printf ("%d\n", stack[top]);
    }

}

void
main ()
{

  int *a;
  int n, ch, item;
  printf ("Enter Size: \n");
  scanf ("%d", &n);
  a = (int *) malloc (n * sizeof (int));
  printf
    ("Enter 1 for push \nEnter 2 for pop \nEnter 3 for Show \nEnter 4 for peek \nEnter 5 for exit \n");
  do
    {
      printf ("Enter choice:\n");
      scanf ("%d", &ch);
      switch (ch)
	{
	case 1:
	  printf ("Enter element\n");
	  scanf ("%d", &item);
	  push (a, n, item);
	  break;
	case 2:
	  pop (a, n);
	  break;
	case 3:
	  show (a);
	  break;
	case 4:
	  peek (a);
	  break;
	case 5:
	  break;
	}
    }
  while (ch != 5);
}
