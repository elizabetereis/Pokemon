   class Jeops_RuleBase_Decisao extends jeops.AbstractRuleBase {
 		  
		  
    /**
     * Identifiers of rule AndarAleatoriamente
     */
    private String[] identifiers_AndarAleatoriamente = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule AndarAleatoriamente
     *
     * @return the identifiers declared in rule AndarAleatoriamente
     */
    private String[] getDeclaredIdentifiers_AndarAleatoriamente() {
         return identifiers_AndarAleatoriamente;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule AndarAleatoriamente.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_AndarAleatoriamente(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule AndarAleatoriamente.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_AndarAleatoriamente(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule AndarAleatoriamente.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_AndarAleatoriamente(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule AndarAleatoriamente.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_AndarAleatoriamente(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule AndarAleatoriamente
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_AndarAleatoriamente() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule AndarAleatoriamente
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_AndarAleatoriamente(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule AndarAleatoriamente.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosCima(am.getAgente().getPosicao()) == -1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarAleatoriamente_cond_0() {
        return (AgenteMapa_1.getMapa().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) == -1);
    }

    /**
     * Condition 1 of rule AndarAleatoriamente.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosBaixo(am.getAgente().getPosicao()) == -1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarAleatoriamente_cond_1() {
        return (AgenteMapa_1.getMapa().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) == -1);
    }

    /**
     * Condition 2 of rule AndarAleatoriamente.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosDireita(am.getAgente().getPosicao()) == -1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarAleatoriamente_cond_2() {
        return (AgenteMapa_1.getMapa().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) == -1);
    }

    /**
     * Condition 3 of rule AndarAleatoriamente.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosEsquerda(am.getAgente().getPosicao()) == -1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarAleatoriamente_cond_3() {
        return (AgenteMapa_1.getMapa().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) == -1);
    }

    /**
     * Checks whether some conditions of rule AndarAleatoriamente is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarAleatoriamente_cond(int index) {
        switch (index) {
            case 0: return AndarAleatoriamente_cond_0();
            case 1: return AndarAleatoriamente_cond_1();
            case 2: return AndarAleatoriamente_cond_2();
            case 3: return AndarAleatoriamente_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule AndarAleatoriamente that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_AndarAleatoriamente(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!AndarAleatoriamente_cond_0()) return false;
                if (!AndarAleatoriamente_cond_1()) return false;
                if (!AndarAleatoriamente_cond_2()) return false;
                if (!AndarAleatoriamente_cond_3()) return false;
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
    private boolean checkCondForDeclaration_AndarAleatoriamente(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule AndarAleatoriamente
     */
    private void AndarAleatoriamente() {
		      AgenteMapa_1.getAgente().setDecisao(1);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule UsarPokebola
     */
    private String[] identifiers_UsarPokebola = {
        "am"
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
            case 0: return "AgenteMapa";
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
            case 0: return AgenteMapa.class;
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
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
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
            case 0: return AgenteMapa_1;
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
                            AgenteMapa_1
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
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule UsarPokebola.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosCima(am.getAgente().getPosicao()) >= 4 ||
		    	am.getMapa().existemElementosBaixo(am.getAgente().getPosicao()) >= 4 || 
		    	am.getMapa().existemElementosEsquerda(am.getAgente().getPosicao()) >= 4 ||
		    	am.getMapa().existemElementosDireita(am.getAgente().getPosicao()) >= 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean UsarPokebola_cond_0() {
        return (AgenteMapa_1.getMapa().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) >= 4 ||
		    	AgenteMapa_1.getMapa().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) >= 4 || 
		    	AgenteMapa_1.getMapa().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) >= 4 ||
		    	AgenteMapa_1.getMapa().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) >= 4);
    }

    /**
     * Condition 1 of rule UsarPokebola.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getQuantidadePokebolas() > 0</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean UsarPokebola_cond_1() {
        return (AgenteMapa_1.getAgente().getQuantidadePokebolas() > 0);
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
                if (!UsarPokebola_cond_1()) return false;
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
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule UsarPokebola
     */
    private void UsarPokebola() {
		      AgenteMapa_1.getAgente().setDecisao(2);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule Batalhar
     */
    private String[] identifiers_Batalhar = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule Batalhar
     *
     * @return the identifiers declared in rule Batalhar
     */
    private String[] getDeclaredIdentifiers_Batalhar() {
         return identifiers_Batalhar;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule Batalhar.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_Batalhar(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule Batalhar.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_Batalhar(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule Batalhar.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_Batalhar(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule Batalhar.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_Batalhar(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule Batalhar
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_Batalhar() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule Batalhar
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_Batalhar(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule Batalhar.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosCima(am.getAgente().getPosicao()) == 3</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Batalhar_cond_0() {
        return (AgenteMapa_1.getMapa().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) == 3);
    }

    /**
     * Condition 1 of rule Batalhar.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosCima(am.getAgente().getPosicao()) < 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Batalhar_cond_1() {
        return (AgenteMapa_1.getMapa().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) < 4);
    }

    /**
     * Condition 2 of rule Batalhar.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosBaixo(am.getAgente().getPosicao()) < 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Batalhar_cond_2() {
        return (AgenteMapa_1.getMapa().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) < 4);
    }

    /**
     * Condition 3 of rule Batalhar.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosDireita(am.getAgente().getPosicao()) < 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Batalhar_cond_3() {
        return (AgenteMapa_1.getMapa().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) < 4);
    }

    /**
     * Condition 4 of rule Batalhar.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosEsquerda(am.getAgente().getPosicao()) < 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Batalhar_cond_4() {
        return (AgenteMapa_1.getMapa().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) < 4);
    }

    /**
     * Condition 5 of rule Batalhar.<p>
     * The original expression was:<br>
     * <code>(am.getMapa().existemElementosCima(am.getAgente().getPosicao()) != 1 &&
		    	am.getMapa().existemElementosBaixo(am.getAgente().getPosicao()) != 1 &&
		    	am.getMapa().existemElementosDireita(am.getAgente().getPosicao()) != 1 &&
		    	am.getMapa().existemElementosEsquerda(am.getAgente().getPosicao()) != 1)||
		    	(((am.getMapa().existemElementosCima(am.getAgente().getPosicao()) == 1)||
		    	(am.getMapa().existemElementosBaixo(am.getAgente().getPosicao()) == 1) ||
		    	(am.getMapa().existemElementosDireita(am.getAgente().getPosicao()) == 1)||
		    	(am.getMapa().existemElementosEsquerda(am.getAgente().getPosicao()) == 1)) && 
		    	am.getAgente().isPokemonsRecuperados())</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Batalhar_cond_5() {
        return ((AgenteMapa_1.getMapa().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) != 1 &&
		    	AgenteMapa_1.getMapa().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) != 1 &&
		    	AgenteMapa_1.getMapa().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) != 1 &&
		    	AgenteMapa_1.getMapa().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) != 1)||
		    	(((AgenteMapa_1.getMapa().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) == 1)||
		    	(AgenteMapa_1.getMapa().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) == 1) ||
		    	(AgenteMapa_1.getMapa().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) == 1)||
		    	(AgenteMapa_1.getMapa().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) == 1)) && 
		    	AgenteMapa_1.getAgente().isPokemonsRecuperados()));
    }

    /**
     * Checks whether some conditions of rule Batalhar is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Batalhar_cond(int index) {
        switch (index) {
            case 0: return Batalhar_cond_0();
            case 1: return Batalhar_cond_1();
            case 2: return Batalhar_cond_2();
            case 3: return Batalhar_cond_3();
            case 4: return Batalhar_cond_4();
            case 5: return Batalhar_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule Batalhar that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_Batalhar(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!Batalhar_cond_0()) return false;
                if (!Batalhar_cond_1()) return false;
                if (!Batalhar_cond_2()) return false;
                if (!Batalhar_cond_3()) return false;
                if (!Batalhar_cond_4()) return false;
                if (!Batalhar_cond_5()) return false;
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
    private boolean checkCondForDeclaration_Batalhar(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule Batalhar
     */
    private void Batalhar() {
		      AgenteMapa_1.getAgente().setDecisao(3);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule RecuperarPokemons
     */
    private String[] identifiers_RecuperarPokemons = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule RecuperarPokemons
     *
     * @return the identifiers declared in rule RecuperarPokemons
     */
    private String[] getDeclaredIdentifiers_RecuperarPokemons() {
         return identifiers_RecuperarPokemons;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule RecuperarPokemons.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_RecuperarPokemons(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule RecuperarPokemons.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_RecuperarPokemons(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule RecuperarPokemons.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_RecuperarPokemons(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule RecuperarPokemons.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_RecuperarPokemons(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule RecuperarPokemons
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_RecuperarPokemons() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule RecuperarPokemons
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_RecuperarPokemons(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule RecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosCima(am.getAgente().getPosicao()) == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean RecuperarPokemons_cond_0() {
        return (AgenteMapa_1.getMapa().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) == 1);
    }

    /**
     * Condition 1 of rule RecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosBaixo(am.getAgente().getPosicao()) == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean RecuperarPokemons_cond_1() {
        return (AgenteMapa_1.getMapa().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) == 1);
    }

    /**
     * Condition 2 of rule RecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosDireita(am.getAgente().getPosicao()) == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean RecuperarPokemons_cond_2() {
        return (AgenteMapa_1.getMapa().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) == 1);
    }

    /**
     * Condition 3 of rule RecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosEsquerda(am.getAgente().getPosicao()) == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean RecuperarPokemons_cond_3() {
        return (AgenteMapa_1.getMapa().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) == 1);
    }

    /**
     * Condition 4 of rule RecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>!am.getAgente().isPokemonsRecuperados()</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean RecuperarPokemons_cond_4() {
        return (!AgenteMapa_1.getAgente().isPokemonsRecuperados());
    }

    /**
     * Checks whether some conditions of rule RecuperarPokemons is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean RecuperarPokemons_cond(int index) {
        switch (index) {
            case 0: return RecuperarPokemons_cond_0();
            case 1: return RecuperarPokemons_cond_1();
            case 2: return RecuperarPokemons_cond_2();
            case 3: return RecuperarPokemons_cond_3();
            case 4: return RecuperarPokemons_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule RecuperarPokemons that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_RecuperarPokemons(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!RecuperarPokemons_cond_0()) return false;
                if (!RecuperarPokemons_cond_1()) return false;
                if (!RecuperarPokemons_cond_2()) return false;
                if (!RecuperarPokemons_cond_3()) return false;
                if (!RecuperarPokemons_cond_4()) return false;
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
    private boolean checkCondForDeclaration_RecuperarPokemons(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule RecuperarPokemons
     */
    private void RecuperarPokemons() {
		      AgenteMapa_1.getAgente().setDecisao(4);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule ComprarPokebolas
     */
    private String[] identifiers_ComprarPokebolas = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule ComprarPokebolas
     *
     * @return the identifiers declared in rule ComprarPokebolas
     */
    private String[] getDeclaredIdentifiers_ComprarPokebolas() {
         return identifiers_ComprarPokebolas;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ComprarPokebolas.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ComprarPokebolas(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ComprarPokebolas.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ComprarPokebolas(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ComprarPokebolas.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ComprarPokebolas(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ComprarPokebolas.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ComprarPokebolas(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ComprarPokebolas
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ComprarPokebolas() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ComprarPokebolas
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ComprarPokebolas(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule ComprarPokebolas.<p>
     * The original expression was:<br>
     * <code>am.getMapa().existemElementosCima(am.getAgente().getPosicao()) == 2 ||
		    	am.getMapa().existemElementosBaixo(am.getAgente().getPosicao()) == 2 ||
		    	am.getMapa().existemElementosDireita(am.getAgente().getPosicao()) == 2 ||
		    	am.getMapa().existemElementosEsquerda(am.getAgente().getPosicao()) == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ComprarPokebolas_cond_0() {
        return (AgenteMapa_1.getMapa().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) == 2 ||
		    	AgenteMapa_1.getMapa().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) == 2 ||
		    	AgenteMapa_1.getMapa().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) == 2 ||
		    	AgenteMapa_1.getMapa().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) == 2);
    }

    /**
     * Condition 1 of rule ComprarPokebolas.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getQuantidadePokebolas() == 0</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ComprarPokebolas_cond_1() {
        return (AgenteMapa_1.getAgente().getQuantidadePokebolas() == 0);
    }

    /**
     * Checks whether some conditions of rule ComprarPokebolas is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ComprarPokebolas_cond(int index) {
        switch (index) {
            case 0: return ComprarPokebolas_cond_0();
            case 1: return ComprarPokebolas_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ComprarPokebolas that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ComprarPokebolas(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ComprarPokebolas_cond_0()) return false;
                if (!ComprarPokebolas_cond_1()) return false;
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
    private boolean checkCondForDeclaration_ComprarPokebolas(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule ComprarPokebolas
     */
    private void ComprarPokebolas() {
		      AgenteMapa_1.getAgente().setDecisao(5);
		      modified(AgenteMapa_1);
		      }


		  
  
    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "AndarAleatoriamente",
        "UsarPokebola",
        "Batalhar",
        "RecuperarPokemons",
        "ComprarPokebolas"
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
        1,
        1,
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
        4,
        2,
        6,
        5,
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
            case 0: return AndarAleatoriamente_cond(condIndex);
            case 1: return UsarPokebola_cond(condIndex);
            case 2: return Batalhar_cond(condIndex);
            case 3: return RecuperarPokemons_cond(condIndex);
            case 4: return ComprarPokebolas_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_AndarAleatoriamente(declIndex);
            case 1: return checkConditionsOnlyOf_UsarPokebola(declIndex);
            case 2: return checkConditionsOnlyOf_Batalhar(declIndex);
            case 3: return checkConditionsOnlyOf_RecuperarPokemons(declIndex);
            case 4: return checkConditionsOnlyOf_ComprarPokebolas(declIndex);
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
            case 0: return checkCondForDeclaration_AndarAleatoriamente(declIndex);
            case 1: return checkCondForDeclaration_UsarPokebola(declIndex);
            case 2: return checkCondForDeclaration_Batalhar(declIndex);
            case 3: return checkCondForDeclaration_RecuperarPokemons(declIndex);
            case 4: return checkCondForDeclaration_ComprarPokebolas(declIndex);
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
            case 0: return getDeclaredClassName_AndarAleatoriamente(declIndex);
            case 1: return getDeclaredClassName_UsarPokebola(declIndex);
            case 2: return getDeclaredClassName_Batalhar(declIndex);
            case 3: return getDeclaredClassName_RecuperarPokemons(declIndex);
            case 4: return getDeclaredClassName_ComprarPokebolas(declIndex);
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
            case 0: return getDeclaredClass_AndarAleatoriamente(declIndex);
            case 1: return getDeclaredClass_UsarPokebola(declIndex);
            case 2: return getDeclaredClass_Batalhar(declIndex);
            case 3: return getDeclaredClass_RecuperarPokemons(declIndex);
            case 4: return getDeclaredClass_ComprarPokebolas(declIndex);
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
            case 0: AndarAleatoriamente(); break;
            case 1: UsarPokebola(); break;
            case 2: Batalhar(); break;
            case 3: RecuperarPokemons(); break;
            case 4: ComprarPokebolas(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 5;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_AndarAleatoriamente();
            case 1: return getDeclaredIdentifiers_UsarPokebola();
            case 2: return getDeclaredIdentifiers_Batalhar();
            case 3: return getDeclaredIdentifiers_RecuperarPokemons();
            case 4: return getDeclaredIdentifiers_ComprarPokebolas();
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
            case 0: setObject_AndarAleatoriamente(declIndex, value); break;
            case 1: setObject_UsarPokebola(declIndex, value); break;
            case 2: setObject_Batalhar(declIndex, value); break;
            case 3: setObject_RecuperarPokemons(declIndex, value); break;
            case 4: setObject_ComprarPokebolas(declIndex, value); break;
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
            case 0: return getObject_AndarAleatoriamente(declIndex);
            case 1: return getObject_UsarPokebola(declIndex);
            case 2: return getObject_Batalhar(declIndex);
            case 3: return getObject_RecuperarPokemons(declIndex);
            case 4: return getObject_ComprarPokebolas(declIndex);
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
            case 0: return getObjects_AndarAleatoriamente();
            case 1: return getObjects_UsarPokebola();
            case 2: return getObjects_Batalhar();
            case 3: return getObjects_RecuperarPokemons();
            case 4: return getObjects_ComprarPokebolas();
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
            case 0: setObjects_AndarAleatoriamente(objects); break;
            case 1: setObjects_UsarPokebola(objects); break;
            case 2: setObjects_Batalhar(objects); break;
            case 3: setObjects_RecuperarPokemons(objects); break;
            case 4: setObjects_ComprarPokebolas(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private AgenteMapa AgenteMapa_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_Decisao(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file Decisao.rules
 *
 * @version 05/07/2017
 */
public class Decisao extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public Decisao(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public Decisao() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_Decisao(this);
    }

}
