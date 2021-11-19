import java.util.Stack;

public class Game
{

    Stack<Integer> firstP, secondP;

    public Game(String fp, String sp)
    {
        firstP = new Stack<>();
        secondP = new Stack<>();
        for(int i = 4; i >= 0; i --)
        {
            firstP.push(Integer.parseInt(fp.substring(i, i+1)));
            secondP.push(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item)
    {
        Stack<Integer> newS = new Stack<>();

        while (!s.isEmpty())
            newS.push(s.pop());

        s.push(item);

        while (!newS.isEmpty())
            s.push(newS.pop());
    }

    public String startGame()
    {
        int turn = 0;

        while(!firstP.isEmpty() && !secondP.isEmpty() && turn <= 106)
        {
            if(firstP.peek() > secondP.peek() && secondP.peek() != 0)
            {
                pushBack(firstP, firstP.pop());
                pushBack(firstP, secondP.pop());
            }
            else
            {
                pushBack(secondP, firstP.pop());
                pushBack(secondP, secondP.pop());
            }

            turn++;
        }

        String result = "";

        if(firstP.isEmpty())
            result += "second ";
        else
            result += "first ";

        result += turn;

        if(turn >= 106)
            result = "botva";

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(new Game("13579", "24680").startGame());
    }
}
