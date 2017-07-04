   class Jeops_RuleBase_Andar extends jeops.AbstractRuleBase {
 
		 
    /**
     * Identifiers of rule Cima
     */
    private String[] identifiers_Cima = {
        "a",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule Cima
     *
     * @return the identifiers declared in rule Cima
     */
    private String[] getDeclaredIdentifiers_Cima() {
         return identifiers_Cima;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule Cima.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_Cima(int index) {
        switch (index) {
            case 0: return "Agente";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule Cima.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_Cima(int index) {
        switch (index) {
            case 0: return Agente.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule Cima.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_Cima(int index, Object value) {
        switch (index) {
            case 0: this.Agente_1 = (Agente) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule Cima.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_Cima(int index) {
        switch (index) {
            case 0: return Agente_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule Cima
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_Cima() {
        return new Object[] {
                            Agente_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule Cima
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_Cima(Object[] objects) {
        Agente_1 = (Agente) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule Cima.<p>
     * The original expression was:<br>
     * <code>a.getOrientacao() == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Cima_cond_0() {
        return (Agente_1.getOrientacao() == 1);
    }

    /**
     * Checks whether some conditions of rule Cima is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Cima_cond(int index) {
        switch (index) {
            case 0: return Cima_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule Cima that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_Cima(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!Cima_cond_0()) return false;
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
    private boolean checkCondForDeclaration_Cima(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule Cima
     */
    private void Cima() {
		      System.out.println("Voc� andou para cima.");
		      Vector_1 = Agente_1.getPosicao();
		      Vector v = new Vector(Vector_1.getX(), Vector_1.getY() - 1);
		      Agente_1.setPosicao(v);
		      Agente_1.setCustoAcao(-1);
		      modified(Agente_1);
		      }


		  
		  
    /**
     * Identifiers of rule Baixo
     */
    private String[] identifiers_Baixo = {
        "a",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule Baixo
     *
     * @return the identifiers declared in rule Baixo
     */
    private String[] getDeclaredIdentifiers_Baixo() {
         return identifiers_Baixo;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule Baixo.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_Baixo(int index) {
        switch (index) {
            case 0: return "Agente";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule Baixo.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_Baixo(int index) {
        switch (index) {
            case 0: return Agente.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule Baixo.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_Baixo(int index, Object value) {
        switch (index) {
            case 0: this.Agente_1 = (Agente) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule Baixo.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_Baixo(int index) {
        switch (index) {
            case 0: return Agente_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule Baixo
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_Baixo() {
        return new Object[] {
                            Agente_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule Baixo
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_Baixo(Object[] objects) {
        Agente_1 = (Agente) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule Baixo.<p>
     * The original expression was:<br>
     * <code>a.getOrientacao() == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Baixo_cond_0() {
        return (Agente_1.getOrientacao() == 2);
    }

    /**
     * Checks whether some conditions of rule Baixo is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Baixo_cond(int index) {
        switch (index) {
            case 0: return Baixo_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule Baixo that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_Baixo(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!Baixo_cond_0()) return false;
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
    private boolean checkCondForDeclaration_Baixo(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule Baixo
     */
    private void Baixo() {
		      System.out.println("Voc� andou para baixo.");
		      Vector_1 = Agente_1.getPosicao();
		      Vector v = new Vector(Vector_1.getX(), Vector_1.getY() + 1);
		      Agente_1.setPosicao(v);
		      Agente_1.setCustoAcao(-1);
		      modified(Agente_1);
		      }


		  
		  
    /**
     * Identifiers of rule Direita
     */
    private String[] identifiers_Direita = {
        "a",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule Direita
     *
     * @return the identifiers declared in rule Direita
     */
    private String[] getDeclaredIdentifiers_Direita() {
         return identifiers_Direita;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule Direita.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_Direita(int index) {
        switch (index) {
            case 0: return "Agente";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule Direita.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_Direita(int index) {
        switch (index) {
            case 0: return Agente.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule Direita.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_Direita(int index, Object value) {
        switch (index) {
            case 0: this.Agente_1 = (Agente) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule Direita.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_Direita(int index) {
        switch (index) {
            case 0: return Agente_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule Direita
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_Direita() {
        return new Object[] {
                            Agente_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule Direita
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_Direita(Object[] objects) {
        Agente_1 = (Agente) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule Direita.<p>
     * The original expression was:<br>
     * <code>a.getOrientacao() == 3</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Direita_cond_0() {
        return (Agente_1.getOrientacao() == 3);
    }

    /**
     * Checks whether some conditions of rule Direita is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Direita_cond(int index) {
        switch (index) {
            case 0: return Direita_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule Direita that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_Direita(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!Direita_cond_0()) return false;
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
    private boolean checkCondForDeclaration_Direita(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule Direita
     */
    private void Direita() {
		      System.out.println("Voc� andou para direita.");
		      Vector_1 = Agente_1.getPosicao();
		      Vector v = new Vector(Vector_1.getX() + 1, Vector_1.getY());
		      Agente_1.setPosicao(v);
		      Agente_1.setCustoAcao(-1);
		      modified(Agente_1);
		      }


		  
		  
    /**
     * Identifiers of rule Esquerda
     */
    private String[] identifiers_Esquerda = {
        "a",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule Esquerda
     *
     * @return the identifiers declared in rule Esquerda
     */
    private String[] getDeclaredIdentifiers_Esquerda() {
         return identifiers_Esquerda;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule Esquerda.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_Esquerda(int index) {
        switch (index) {
            case 0: return "Agente";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule Esquerda.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_Esquerda(int index) {
        switch (index) {
            case 0: return Agente.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule Esquerda.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_Esquerda(int index, Object value) {
        switch (index) {
            case 0: this.Agente_1 = (Agente) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule Esquerda.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_Esquerda(int index) {
        switch (index) {
            case 0: return Agente_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule Esquerda
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_Esquerda() {
        return new Object[] {
                            Agente_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule Esquerda
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_Esquerda(Object[] objects) {
        Agente_1 = (Agente) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule Esquerda.<p>
     * The original expression was:<br>
     * <code>a.getOrientacao() == 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Esquerda_cond_0() {
        return (Agente_1.getOrientacao() == 4);
    }

    /**
     * Checks whether some conditions of rule Esquerda is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Esquerda_cond(int index) {
        switch (index) {
            case 0: return Esquerda_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule Esquerda that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_Esquerda(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!Esquerda_cond_0()) return false;
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
    private boolean checkCondForDeclaration_Esquerda(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule Esquerda
     */
    private void Esquerda() {
		      System.out.println("Voc� andou para esquerda.");
		      Vector_1 = Agente_1.getPosicao();
		      Vector v = new Vector(Vector_1.getX() - 1, Vector_1.getY());
		      Agente_1.setPosicao(v);
		      Agente_1.setCustoAcao(-1);
		      modified(Agente_1);
		      }


  
    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "Cima",
        "Baixo",
        "Direita",
        "Esquerda"
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
        2,
        2,
        2,
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
        1,
        1,
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
            case 0: return Cima_cond(condIndex);
            case 1: return Baixo_cond(condIndex);
            case 2: return Direita_cond(condIndex);
            case 3: return Esquerda_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_Cima(declIndex);
            case 1: return checkConditionsOnlyOf_Baixo(declIndex);
            case 2: return checkConditionsOnlyOf_Direita(declIndex);
            case 3: return checkConditionsOnlyOf_Esquerda(declIndex);
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
            case 0: return checkCondForDeclaration_Cima(declIndex);
            case 1: return checkCondForDeclaration_Baixo(declIndex);
            case 2: return checkCondForDeclaration_Direita(declIndex);
            case 3: return checkCondForDeclaration_Esquerda(declIndex);
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
            case 0: return getDeclaredClassName_Cima(declIndex);
            case 1: return getDeclaredClassName_Baixo(declIndex);
            case 2: return getDeclaredClassName_Direita(declIndex);
            case 3: return getDeclaredClassName_Esquerda(declIndex);
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
            case 0: return getDeclaredClass_Cima(declIndex);
            case 1: return getDeclaredClass_Baixo(declIndex);
            case 2: return getDeclaredClass_Direita(declIndex);
            case 3: return getDeclaredClass_Esquerda(declIndex);
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
            case 0: Cima(); break;
            case 1: Baixo(); break;
            case 2: Direita(); break;
            case 3: Esquerda(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 4;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_Cima();
            case 1: return getDeclaredIdentifiers_Baixo();
            case 2: return getDeclaredIdentifiers_Direita();
            case 3: return getDeclaredIdentifiers_Esquerda();
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
            case 0: setObject_Cima(declIndex, value); break;
            case 1: setObject_Baixo(declIndex, value); break;
            case 2: setObject_Direita(declIndex, value); break;
            case 3: setObject_Esquerda(declIndex, value); break;
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
            case 0: return getObject_Cima(declIndex);
            case 1: return getObject_Baixo(declIndex);
            case 2: return getObject_Direita(declIndex);
            case 3: return getObject_Esquerda(declIndex);
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
            case 0: return getObjects_Cima();
            case 1: return getObjects_Baixo();
            case 2: return getObjects_Direita();
            case 3: return getObjects_Esquerda();
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
            case 0: setObjects_Cima(objects); break;
            case 1: setObjects_Baixo(objects); break;
            case 2: setObjects_Direita(objects); break;
            case 3: setObjects_Esquerda(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private Agente Agente_1;
    private Vector Vector_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_Andar(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file Andar.rules
 *
 * @version Jul 3, 2017
 */
public class Andar extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public Andar(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public Andar() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_Andar(this);
    }

}
