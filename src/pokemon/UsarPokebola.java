package pokemon;
   class Jeops_RuleBase_UsarPokebola extends jeops.AbstractRuleBase {
		  
    /**
     * Identifiers of rule UsarPokebola
     */
    private String[] identifiers_UsarPokebola = {
        "a",
        "mapa"
    };

    /**
     * Returns the identifiers declared in rule UsarPokebola
     *
     * @return the identifiers declared in rule UsarPokebola
     */
    private String[] getDeclaredIdentifiers_UsarPokebola() {
         return identifiers_UsarPokebola;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule UsarPokebola.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_UsarPokebola(int index) {
        switch (index) {
            case 0: return "Agente";
            case 1: return "MapaElemento";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule UsarPokebola.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_UsarPokebola(int index) {
        switch (index) {
            case 0: return Agente.class;
            case 1: return MapaElemento.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule UsarPokebola.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_UsarPokebola(int index, Object value) {
        switch (index) {
            case 0: this.Agente_1 = (Agente) value; break;
            case 1: this.MapaElemento_1 = (MapaElemento) value; break;
        }
    }

    /**
     * Returns an object declared in the rule UsarPokebola.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_UsarPokebola(int index) {
        switch (index) {
            case 0: return Agente_1;
            case 1: return MapaElemento_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule UsarPokebola
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_UsarPokebola() {
        return new Object[] {
                            Agente_1,
                            MapaElemento_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule UsarPokebola
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_UsarPokebola(Object[] objects) {
        Agente_1 = (Agente) objects[0];
        MapaElemento_1 = (MapaElemento) objects[1];
    }

    /**
     * Condition 0 of rule UsarPokebola.<p>
     * The original expression was:<br>
     * <code>a.getQuantidadePokebolas() > 0</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean UsarPokebola_cond_0() {
        return (Agente_1.getQuantidadePokebolas() > 0);
    }

    /**
     * Condition 1 of rule UsarPokebola.<p>
     * The original expression was:<br>
     * <code>mapa[a.getPosicao().getX()][a.getPosicao().getY()].getElemento().ehUmPokemon()</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean UsarPokebola_cond_1() {
        return (MapaElemento_1[Agente_1.getPosicao().getX()][Agente_1.getPosicao().getY()].getElemento().ehUmPokemon());
    }

    /**
     * Checks whether some conditions of rule UsarPokebola is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean UsarPokebola_cond(int index) {
        switch (index) {
            case 0: return UsarPokebola_cond_0();
            case 1: return UsarPokebola_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule UsarPokebola that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_UsarPokebola(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!UsarPokebola_cond_0()) return false;
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_UsarPokebola(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!UsarPokebola_cond_1()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule UsarPokebola
     */
    private void UsarPokebola() {
		      System.out.println("Você usou uma Pokebola.");
		      Agente_1.setQuantidadePokebolas(Agente_1.getQuantidadePokebolas() - 1);
		      Agente_1.setCustoAcao(-5);
		      modified(Agente_1);
		      }


  
    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "UsarPokebola"
    };

    /**
     * Returns the name of the rules in this class file.
     *
     * @return the name of the rules in this class file.
     */
    public String[] getRuleNames() {
        return File_ruleNames;
    }

    /**
     * The number of declarations of the rules in this class file.
     */
    private static final int[] File_numberOfDeclarations = {
        2
    };

    /**
     * Returns the number of declarations of the rules in this class file.
     *
     * @return the number of declarations  of the rules in this class file.
     */
    public int[] getNumberOfDeclarations() {
        return File_numberOfDeclarations;
    }

    /**
     * The number of conditions of the rules in this class file.
     */
    private static final int[] File_numberOfConditions = {
        2
    };

    /**
     * Returns the number of conditions of the rules in this class file.
     *
     * @return the number of conditions  of the rules in this class file.
     */
    public int[] getNumberOfConditions() {
        return File_numberOfConditions;
    }

    /**
     * Checks whether a condition of some rule is satisfied.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param condIndex the index of the condition to be checked
     * @return <code>true</code> if the corresponding condition for the
     *          given rule is satisfied. <code>false</code> otherwise.
     */
    public boolean checkCondition(int ruleIndex, int condIndex) {
        switch (ruleIndex) {
            case 0: return UsarPokebola_cond(condIndex);
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of some rule that depend only on
     * the given object are satisfied.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          the given rule are satisfied;
     *           <code>false</code> otherwise.
     */
    public boolean checkConditionsOnlyOf(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return checkConditionsOnlyOf_UsarPokebola(declIndex);
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference only the elements declared up to the given index
     * are true.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all the conditions of a rule which
     *          reference only the elements declared up to the given index
     *          are satisfied; <code>false</code> otherwise.
     */
    public boolean checkCondForDeclaration(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return checkCondForDeclaration_UsarPokebola(declIndex);
            default: return false;
        }
    }

    /**
     * Returns the class name of an object declared in a rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration
     * @return the class name of the declared object.
     */
    public String getDeclaredClassName(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredClassName_UsarPokebola(declIndex);
            default: return null;
        }
    }

    /**
     * Returns the class of an object declared in a rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration
     * @return the class of the declared object.
     */
    public Class getDeclaredClass(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredClass_UsarPokebola(declIndex);
            default: return null;
        }
    }

    /**
     * Fires one of the rules in this rule base.
     *
     * @param ruleIndex the index of the rule to be fired
     */
    protected void internalFireRule(int ruleIndex) {
        switch (ruleIndex) {
            case 0: UsarPokebola(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 1;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_UsarPokebola();
            default: return new String[0];
        }
    }

    /**
     * Sets an object that represents a declaration of some rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration in the rule.
     * @param value the value of the object being set.
     */
    public void setObject(int ruleIndex, int declIndex, Object value) {
        switch (ruleIndex) {
            case 0: setObject_UsarPokebola(declIndex, value); break;
        }
    }

    /**
     * Returns an object that represents a declaration of some rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration in the rule.
     * @return the value of the corresponding object.
     */
    public Object getObject(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getObject_UsarPokebola(declIndex);
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations of
     * some rule.
     *
     * @param ruleIndex the index of the rule
     * @return an object array of the variables bound to the
     *          declarations of some rule.
     */
    public Object[] getObjects(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getObjects_UsarPokebola();
            default: return null;
        }
    }
    /**
     * Defines all variables bound to the declarations of
     * some rule.
     *
     * @param ruleIndex the index of the rule
     * @param objects an object array of the variables bound to the
     *          declarations of some rule.
     */
    public void setObjects(int ruleIndex, Object[] objects) {
        switch (ruleIndex) {
            case 0: setObjects_UsarPokebola(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private Agente Agente_1;
    private MapaElemento MapaElemento_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_UsarPokebola(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file UsarPokebola.rules
 *
 * @version 03/07/2017
 */
public class UsarPokebola extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public UsarPokebola(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public UsarPokebola() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_UsarPokebola(this);
    }

}
