

class Jeops_RuleBase_Batalha extends jeops.AbstractRuleBase {
 
		 
    /**
     * Identifiers of rule Perdeu
     */
    private String[] identifiers_Perdeu = {
        "a"
    };

    /**
     * Returns the identifiers declared in rule Perdeu
     *
     * @return the identifiers declared in rule Perdeu
     */
    private String[] getDeclaredIdentifiers_Perdeu() {
         return identifiers_Perdeu;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule Perdeu.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_Perdeu(int index) {
        switch (index) {
            case 0: return "Agente";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule Perdeu.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_Perdeu(int index) {
        switch (index) {
            case 0: return Agente.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule Perdeu.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_Perdeu(int index, Object value) {
        switch (index) {
            case 0: this.Agente_1 = (Agente) value; break;
        }
    }

    /**
     * Returns an object declared in the rule Perdeu.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_Perdeu(int index) {
        switch (index) {
            case 0: return Agente_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule Perdeu
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_Perdeu() {
        return new Object[] {
                            Agente_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule Perdeu
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_Perdeu(Object[] objects) {
        Agente_1 = (Agente) objects[0];
    }

    /**
     * Condition 0 of rule Perdeu.<p>
     * The original expression was:<br>
     * <code>a.isPokemonsRecuperados() == false</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Perdeu_cond_0() {
        return (Agente_1.isPokemonsRecuperados() == false);
    }

    /**
     * Checks whether some conditions of rule Perdeu is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Perdeu_cond(int index) {
        switch (index) {
            case 0: return Perdeu_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule Perdeu that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_Perdeu(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!Perdeu_cond_0()) return false;
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
    private boolean checkCondForDeclaration_Perdeu(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule Perdeu
     */
    private void Perdeu() {
		      System.out.println("Voc� perdeu a batalha.");
		      Agente_1.setCustoAcao(-1000);
		      modified(Agente_1);
		      }


		  
		  
    /**
     * Identifiers of rule Ganhou
     */
    private String[] identifiers_Ganhou = {
        "a"
    };

    /**
     * Returns the identifiers declared in rule Ganhou
     *
     * @return the identifiers declared in rule Ganhou
     */
    private String[] getDeclaredIdentifiers_Ganhou() {
         return identifiers_Ganhou;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule Ganhou.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_Ganhou(int index) {
        switch (index) {
            case 0: return "Agente";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule Ganhou.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_Ganhou(int index) {
        switch (index) {
            case 0: return Agente.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule Ganhou.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_Ganhou(int index, Object value) {
        switch (index) {
            case 0: this.Agente_1 = (Agente) value; break;
        }
    }

    /**
     * Returns an object declared in the rule Ganhou.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_Ganhou(int index) {
        switch (index) {
            case 0: return Agente_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule Ganhou
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_Ganhou() {
        return new Object[] {
                            Agente_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule Ganhou
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_Ganhou(Object[] objects) {
        Agente_1 = (Agente) objects[0];
    }

    /**
     * Condition 0 of rule Ganhou.<p>
     * The original expression was:<br>
     * <code>a.isPokemonsRecuperados() == true</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Ganhou_cond_0() {
        return (Agente_1.isPokemonsRecuperados() == true);
    }

    /**
     * Checks whether some conditions of rule Ganhou is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Ganhou_cond(int index) {
        switch (index) {
            case 0: return Ganhou_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule Ganhou that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_Ganhou(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!Ganhou_cond_0()) return false;
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
    private boolean checkCondForDeclaration_Ganhou(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule Ganhou
     */
    private void Ganhou() {
		      System.out.println("Voc� ganhou a batalha");
		      Agente_1.setCustoAcao(+150);
		      modified(Agente_1);
		      }


  
  
    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "Perdeu",
        "Ganhou"
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
        1,
        1
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
        1,
        1
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
            case 0: return Perdeu_cond(condIndex);
            case 1: return Ganhou_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_Perdeu(declIndex);
            case 1: return checkConditionsOnlyOf_Ganhou(declIndex);
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
            case 0: return checkCondForDeclaration_Perdeu(declIndex);
            case 1: return checkCondForDeclaration_Ganhou(declIndex);
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
            case 0: return getDeclaredClassName_Perdeu(declIndex);
            case 1: return getDeclaredClassName_Ganhou(declIndex);
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
            case 0: return getDeclaredClass_Perdeu(declIndex);
            case 1: return getDeclaredClass_Ganhou(declIndex);
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
            case 0: Perdeu(); break;
            case 1: Ganhou(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 2;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_Perdeu();
            case 1: return getDeclaredIdentifiers_Ganhou();
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
            case 0: setObject_Perdeu(declIndex, value); break;
            case 1: setObject_Ganhou(declIndex, value); break;
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
            case 0: return getObject_Perdeu(declIndex);
            case 1: return getObject_Ganhou(declIndex);
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
            case 0: return getObjects_Perdeu();
            case 1: return getObjects_Ganhou();
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
            case 0: setObjects_Perdeu(objects); break;
            case 1: setObjects_Ganhou(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private Agente Agente_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_Batalha(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file Batalha.rules
 *
 * @version 03/07/2017
 */
public class Batalha extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public Batalha(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public Batalha() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_Batalha(this);
    }

}
