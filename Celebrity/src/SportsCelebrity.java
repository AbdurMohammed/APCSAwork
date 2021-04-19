import java.util.ArrayList;

public class SportsCelebrity extends Celebrity {
    /**
     * Creates a Celebrity instance with the supplied answer and clue
     *
     * @param answer
     * @param clue
     */
    public SportsCelebrity(String answer, String clue) {
        super(answer, clue);
    }

    private ArrayList<String> clueList;

    private void processClues()
    {
        String [] clues = super.getClue().split(",");
        clueList = new ArrayList<String>();
        for (String currentClue : clues)
        {
            clueList.add(currentClue);
        }
    }

    @Override
    public String getClue()
    {
        if (clueList.size() == 0)
        {
            processClues();
        }
        String currentClue = clueList.remove(0);

        return currentClue;
    }


    @Override
    public String toString()
    {
        String dsc = "This is the sports celebrity: " + getAnswer() + "\nThe clues are:\n";

        for (String word : super.getClue().split(","))
        {
            dsc += word + "\n";
        }

        return dsc;
    }


}
