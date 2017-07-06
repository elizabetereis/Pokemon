   class Jeops_RuleBase_RegrasPokemon extends jeops.AbstractRuleBase {
 
 		 
    /**
     * Identifiers of rule DecisaoUsarPokebola
     */
    private String[] identifiers_DecisaoUsarPokebola = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule DecisaoUsarPokebola
     *
     * @return the identifiers declared in rule DecisaoUsarPokebola
     */
    private String[] getDeclaredIdentifiers_DecisaoUsarPokebola() {
         return identifiers_DecisaoUsarPokebola;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule DecisaoUsarPokebola.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_DecisaoUsarPokebola(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule DecisaoUsarPokebola.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_DecisaoUsarPokebola(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule DecisaoUsarPokebola.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_DecisaoUsarPokebola(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule DecisaoUsarPokebola.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_DecisaoUsarPokebola(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule DecisaoUsarPokebola
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_DecisaoUsarPokebola() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule DecisaoUsarPokebola
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_DecisaoUsarPokebola(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule DecisaoUsarPokebola.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getQuantidadePokebolas() > 0</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoUsarPokebola_cond_0() {
        return (AgenteMapa_1.getAgente().getQuantidadePokebolas() > 0);
    }

    /**
     * Condition 1 of rule DecisaoUsarPokebola.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existeElementoPosAtual(am.getAgente().getPosicao()) >= 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoUsarPokebola_cond_1() {
        return (AgenteMapa_1.getMapaElemento().existeElementoPosAtual(AgenteMapa_1.getAgente().getPosicao()) >= 4);
    }

    /**
     * Checks whether some conditions of rule DecisaoUsarPokebola is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoUsarPokebola_cond(int index) {
        switch (index) {
            case 0: return DecisaoUsarPokebola_cond_0();
            case 1: return DecisaoUsarPokebola_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule DecisaoUsarPokebola that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_DecisaoUsarPokebola(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!DecisaoUsarPokebola_cond_0()) return false;
                if (!DecisaoUsarPokebola_cond_1()) return false;
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
    private boolean checkCondForDeclaration_DecisaoUsarPokebola(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule DecisaoUsarPokebola
     */
    private void DecisaoUsarPokebola() {
		      	System.out.println("O agente capturou um pokemon.");
		      	AgenteMapa_1.getAgente().setQuantidadePokebolas(AgenteMapa_1.getAgente().getQuantidadePokebolas() - 1);
		      	AgenteMapa_1.getAgente().setCustoAcao(-5);
		      	AgenteMapa_1.getAgente().setDecisao(2);
		      	modified(AgenteMapa_1);
		      }


 		  
		  
    /**
     * Identifiers of rule DecisaoAndarAleatoriamente
     */
    private String[] identifiers_DecisaoAndarAleatoriamente = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule DecisaoAndarAleatoriamente
     *
     * @return the identifiers declared in rule DecisaoAndarAleatoriamente
     */
    private String[] getDeclaredIdentifiers_DecisaoAndarAleatoriamente() {
         return identifiers_DecisaoAndarAleatoriamente;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule DecisaoAndarAleatoriamente.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_DecisaoAndarAleatoriamente(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule DecisaoAndarAleatoriamente.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_DecisaoAndarAleatoriamente(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule DecisaoAndarAleatoriamente.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_DecisaoAndarAleatoriamente(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule DecisaoAndarAleatoriamente.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_DecisaoAndarAleatoriamente(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule DecisaoAndarAleatoriamente
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_DecisaoAndarAleatoriamente() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule DecisaoAndarAleatoriamente
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_DecisaoAndarAleatoriamente(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule DecisaoAndarAleatoriamente.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getDecisao() == am.getAgente().ANDAR_ALEATORIAMENTE</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoAndarAleatoriamente_cond_0() {
        return (AgenteMapa_1.getAgente().getDecisao() == AgenteMapa_1.getAgente().ANDAR_ALEATORIAMENTE);
    }

    /**
     * Condition 1 of rule DecisaoAndarAleatoriamente.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosCima(am.getAgente().getPosicao()) == -1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoAndarAleatoriamente_cond_1() {
        return (AgenteMapa_1.getMapaElemento().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) == -1);
    }

    /**
     * Condition 2 of rule DecisaoAndarAleatoriamente.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosBaixo(am.getAgente().getPosicao()) == -1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoAndarAleatoriamente_cond_2() {
        return (AgenteMapa_1.getMapaElemento().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) == -1);
    }

    /**
     * Condition 3 of rule DecisaoAndarAleatoriamente.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosDireita(am.getAgente().getPosicao()) == -1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoAndarAleatoriamente_cond_3() {
        return (AgenteMapa_1.getMapaElemento().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) == -1);
    }

    /**
     * Condition 4 of rule DecisaoAndarAleatoriamente.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosEsquerda(am.getAgente().getPosicao()) == -1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoAndarAleatoriamente_cond_4() {
        return (AgenteMapa_1.getMapaElemento().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) == -1);
    }

    /**
     * Checks whether some conditions of rule DecisaoAndarAleatoriamente is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoAndarAleatoriamente_cond(int index) {
        switch (index) {
            case 0: return DecisaoAndarAleatoriamente_cond_0();
            case 1: return DecisaoAndarAleatoriamente_cond_1();
            case 2: return DecisaoAndarAleatoriamente_cond_2();
            case 3: return DecisaoAndarAleatoriamente_cond_3();
            case 4: return DecisaoAndarAleatoriamente_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule DecisaoAndarAleatoriamente that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_DecisaoAndarAleatoriamente(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!DecisaoAndarAleatoriamente_cond_0()) return false;
                if (!DecisaoAndarAleatoriamente_cond_1()) return false;
                if (!DecisaoAndarAleatoriamente_cond_2()) return false;
                if (!DecisaoAndarAleatoriamente_cond_3()) return false;
                if (!DecisaoAndarAleatoriamente_cond_4()) return false;
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
    private boolean checkCondForDeclaration_DecisaoAndarAleatoriamente(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule DecisaoAndarAleatoriamente
     */
    private void DecisaoAndarAleatoriamente() {
		      AgenteMapa_1.getAgente().setDecisao(1);
		      //System.out.println("Decisao andar aleatoriamente");
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule DecisaoBatalhar
     */
    private String[] identifiers_DecisaoBatalhar = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule DecisaoBatalhar
     *
     * @return the identifiers declared in rule DecisaoBatalhar
     */
    private String[] getDeclaredIdentifiers_DecisaoBatalhar() {
         return identifiers_DecisaoBatalhar;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule DecisaoBatalhar.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_DecisaoBatalhar(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule DecisaoBatalhar.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_DecisaoBatalhar(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule DecisaoBatalhar.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_DecisaoBatalhar(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule DecisaoBatalhar.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_DecisaoBatalhar(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule DecisaoBatalhar
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_DecisaoBatalhar() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule DecisaoBatalhar
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_DecisaoBatalhar(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule DecisaoBatalhar.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getDecisao() == am.getAgente().BATALHAR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoBatalhar_cond_0() {
        return (AgenteMapa_1.getAgente().getDecisao() == AgenteMapa_1.getAgente().BATALHAR);
    }

    /**
     * Condition 1 of rule DecisaoBatalhar.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosCima(am.getAgente().getPosicao()) == 3</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoBatalhar_cond_1() {
        return (AgenteMapa_1.getMapaElemento().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) == 3);
    }

    /**
     * Condition 2 of rule DecisaoBatalhar.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosCima(am.getAgente().getPosicao()) < 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoBatalhar_cond_2() {
        return (AgenteMapa_1.getMapaElemento().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) < 4);
    }

    /**
     * Condition 3 of rule DecisaoBatalhar.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosBaixo(am.getAgente().getPosicao()) < 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoBatalhar_cond_3() {
        return (AgenteMapa_1.getMapaElemento().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) < 4);
    }

    /**
     * Condition 4 of rule DecisaoBatalhar.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosDireita(am.getAgente().getPosicao()) < 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoBatalhar_cond_4() {
        return (AgenteMapa_1.getMapaElemento().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) < 4);
    }

    /**
     * Condition 5 of rule DecisaoBatalhar.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosEsquerda(am.getAgente().getPosicao()) < 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoBatalhar_cond_5() {
        return (AgenteMapa_1.getMapaElemento().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) < 4);
    }

    /**
     * Condition 6 of rule DecisaoBatalhar.<p>
     * The original expression was:<br>
     * <code>(am.getMapaElemento().existemElementosCima(am.getAgente().getPosicao()) != 1 &&
		    	am.getMapaElemento().existemElementosBaixo(am.getAgente().getPosicao()) != 1 &&
		    	am.getMapaElemento().existemElementosDireita(am.getAgente().getPosicao()) != 1 &&
		    	am.getMapaElemento().existemElementosEsquerda(am.getAgente().getPosicao()) != 1)||
		    	(((am.getMapaElemento().existemElementosCima(am.getAgente().getPosicao()) == 1)||
		    	(am.getMapaElemento().existemElementosBaixo(am.getAgente().getPosicao()) == 1) ||
		    	(am.getMapaElemento().existemElementosDireita(am.getAgente().getPosicao()) == 1)||
		    	(am.getMapaElemento().existemElementosEsquerda(am.getAgente().getPosicao()) == 1)) && 
		    	am.getAgente().isPokemonsRecuperados())</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoBatalhar_cond_6() {
        return ((AgenteMapa_1.getMapaElemento().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) != 1 &&
		    	AgenteMapa_1.getMapaElemento().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) != 1 &&
		    	AgenteMapa_1.getMapaElemento().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) != 1 &&
		    	AgenteMapa_1.getMapaElemento().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) != 1)||
		    	(((AgenteMapa_1.getMapaElemento().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) == 1)||
		    	(AgenteMapa_1.getMapaElemento().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) == 1) ||
		    	(AgenteMapa_1.getMapaElemento().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) == 1)||
		    	(AgenteMapa_1.getMapaElemento().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) == 1)) && 
		    	AgenteMapa_1.getAgente().isPokemonsRecuperados()));
    }

    /**
     * Checks whether some conditions of rule DecisaoBatalhar is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoBatalhar_cond(int index) {
        switch (index) {
            case 0: return DecisaoBatalhar_cond_0();
            case 1: return DecisaoBatalhar_cond_1();
            case 2: return DecisaoBatalhar_cond_2();
            case 3: return DecisaoBatalhar_cond_3();
            case 4: return DecisaoBatalhar_cond_4();
            case 5: return DecisaoBatalhar_cond_5();
            case 6: return DecisaoBatalhar_cond_6();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule DecisaoBatalhar that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_DecisaoBatalhar(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!DecisaoBatalhar_cond_0()) return false;
                if (!DecisaoBatalhar_cond_1()) return false;
                if (!DecisaoBatalhar_cond_2()) return false;
                if (!DecisaoBatalhar_cond_3()) return false;
                if (!DecisaoBatalhar_cond_4()) return false;
                if (!DecisaoBatalhar_cond_5()) return false;
                if (!DecisaoBatalhar_cond_6()) return false;
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
    private boolean checkCondForDeclaration_DecisaoBatalhar(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule DecisaoBatalhar
     */
    private void DecisaoBatalhar() {
		      AgenteMapa_1.getAgente().setDecisao(3);
		      System.out.println("Decisao batalhar");
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule DecisaoRecuperarPokemons
     */
    private String[] identifiers_DecisaoRecuperarPokemons = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule DecisaoRecuperarPokemons
     *
     * @return the identifiers declared in rule DecisaoRecuperarPokemons
     */
    private String[] getDeclaredIdentifiers_DecisaoRecuperarPokemons() {
         return identifiers_DecisaoRecuperarPokemons;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule DecisaoRecuperarPokemons.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_DecisaoRecuperarPokemons(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule DecisaoRecuperarPokemons.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_DecisaoRecuperarPokemons(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule DecisaoRecuperarPokemons.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_DecisaoRecuperarPokemons(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule DecisaoRecuperarPokemons.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_DecisaoRecuperarPokemons(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule DecisaoRecuperarPokemons
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_DecisaoRecuperarPokemons() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule DecisaoRecuperarPokemons
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_DecisaoRecuperarPokemons(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule DecisaoRecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getDecisao() == am.getAgente().RECUPERAR_POKEMONS</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoRecuperarPokemons_cond_0() {
        return (AgenteMapa_1.getAgente().getDecisao() == AgenteMapa_1.getAgente().RECUPERAR_POKEMONS);
    }

    /**
     * Condition 1 of rule DecisaoRecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosCima(am.getAgente().getPosicao()) == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoRecuperarPokemons_cond_1() {
        return (AgenteMapa_1.getMapaElemento().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) == 1);
    }

    /**
     * Condition 2 of rule DecisaoRecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosBaixo(am.getAgente().getPosicao()) == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoRecuperarPokemons_cond_2() {
        return (AgenteMapa_1.getMapaElemento().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) == 1);
    }

    /**
     * Condition 3 of rule DecisaoRecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosDireita(am.getAgente().getPosicao()) == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoRecuperarPokemons_cond_3() {
        return (AgenteMapa_1.getMapaElemento().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) == 1);
    }

    /**
     * Condition 4 of rule DecisaoRecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosEsquerda(am.getAgente().getPosicao()) == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoRecuperarPokemons_cond_4() {
        return (AgenteMapa_1.getMapaElemento().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) == 1);
    }

    /**
     * Condition 5 of rule DecisaoRecuperarPokemons.<p>
     * The original expression was:<br>
     * <code>!am.getAgente().isPokemonsRecuperados()</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoRecuperarPokemons_cond_5() {
        return (!AgenteMapa_1.getAgente().isPokemonsRecuperados());
    }

    /**
     * Checks whether some conditions of rule DecisaoRecuperarPokemons is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoRecuperarPokemons_cond(int index) {
        switch (index) {
            case 0: return DecisaoRecuperarPokemons_cond_0();
            case 1: return DecisaoRecuperarPokemons_cond_1();
            case 2: return DecisaoRecuperarPokemons_cond_2();
            case 3: return DecisaoRecuperarPokemons_cond_3();
            case 4: return DecisaoRecuperarPokemons_cond_4();
            case 5: return DecisaoRecuperarPokemons_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule DecisaoRecuperarPokemons that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_DecisaoRecuperarPokemons(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!DecisaoRecuperarPokemons_cond_0()) return false;
                if (!DecisaoRecuperarPokemons_cond_1()) return false;
                if (!DecisaoRecuperarPokemons_cond_2()) return false;
                if (!DecisaoRecuperarPokemons_cond_3()) return false;
                if (!DecisaoRecuperarPokemons_cond_4()) return false;
                if (!DecisaoRecuperarPokemons_cond_5()) return false;
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
    private boolean checkCondForDeclaration_DecisaoRecuperarPokemons(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule DecisaoRecuperarPokemons
     */
    private void DecisaoRecuperarPokemons() {
		      AgenteMapa_1.getAgente().setDecisao(4);
		      System.out.println("Decisao recuperar pokemons");
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule DecisaoComprarPokebolas
     */
    private String[] identifiers_DecisaoComprarPokebolas = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule DecisaoComprarPokebolas
     *
     * @return the identifiers declared in rule DecisaoComprarPokebolas
     */
    private String[] getDeclaredIdentifiers_DecisaoComprarPokebolas() {
         return identifiers_DecisaoComprarPokebolas;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule DecisaoComprarPokebolas.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_DecisaoComprarPokebolas(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule DecisaoComprarPokebolas.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_DecisaoComprarPokebolas(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule DecisaoComprarPokebolas.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_DecisaoComprarPokebolas(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule DecisaoComprarPokebolas.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_DecisaoComprarPokebolas(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule DecisaoComprarPokebolas
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_DecisaoComprarPokebolas() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule DecisaoComprarPokebolas
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_DecisaoComprarPokebolas(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule DecisaoComprarPokebolas.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getDecisao() == am.getAgente().COMPRAR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoComprarPokebolas_cond_0() {
        return (AgenteMapa_1.getAgente().getDecisao() == AgenteMapa_1.getAgente().COMPRAR);
    }

    /**
     * Condition 1 of rule DecisaoComprarPokebolas.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existemElementosCima(am.getAgente().getPosicao()) == 2 ||
		    	am.getMapaElemento().existemElementosBaixo(am.getAgente().getPosicao()) == 2 ||
		    	am.getMapaElemento().existemElementosDireita(am.getAgente().getPosicao()) == 2 ||
		    	am.getMapaElemento().existemElementosEsquerda(am.getAgente().getPosicao()) == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoComprarPokebolas_cond_1() {
        return (AgenteMapa_1.getMapaElemento().existemElementosCima(AgenteMapa_1.getAgente().getPosicao()) == 2 ||
		    	AgenteMapa_1.getMapaElemento().existemElementosBaixo(AgenteMapa_1.getAgente().getPosicao()) == 2 ||
		    	AgenteMapa_1.getMapaElemento().existemElementosDireita(AgenteMapa_1.getAgente().getPosicao()) == 2 ||
		    	AgenteMapa_1.getMapaElemento().existemElementosEsquerda(AgenteMapa_1.getAgente().getPosicao()) == 2);
    }

    /**
     * Condition 2 of rule DecisaoComprarPokebolas.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getQuantidadePokebolas() == 0</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoComprarPokebolas_cond_2() {
        return (AgenteMapa_1.getAgente().getQuantidadePokebolas() == 0);
    }

    /**
     * Checks whether some conditions of rule DecisaoComprarPokebolas is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoComprarPokebolas_cond(int index) {
        switch (index) {
            case 0: return DecisaoComprarPokebolas_cond_0();
            case 1: return DecisaoComprarPokebolas_cond_1();
            case 2: return DecisaoComprarPokebolas_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule DecisaoComprarPokebolas that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_DecisaoComprarPokebolas(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!DecisaoComprarPokebolas_cond_0()) return false;
                if (!DecisaoComprarPokebolas_cond_1()) return false;
                if (!DecisaoComprarPokebolas_cond_2()) return false;
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
    private boolean checkCondForDeclaration_DecisaoComprarPokebolas(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule DecisaoComprarPokebolas
     */
    private void DecisaoComprarPokebolas() {
		      AgenteMapa_1.getAgente().setDecisao(5);
		      System.out.println("Decisao comprar pokebolas");
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule BatlhaPerder
     */
    private String[] identifiers_BatlhaPerder = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule BatlhaPerder
     *
     * @return the identifiers declared in rule BatlhaPerder
     */
    private String[] getDeclaredIdentifiers_BatlhaPerder() {
         return identifiers_BatlhaPerder;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule BatlhaPerder.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_BatlhaPerder(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule BatlhaPerder.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_BatlhaPerder(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule BatlhaPerder.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_BatlhaPerder(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule BatlhaPerder.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_BatlhaPerder(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule BatlhaPerder
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_BatlhaPerder() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule BatlhaPerder
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_BatlhaPerder(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule BatlhaPerder.<p>
     * The original expression was:<br>
     * <code>am.getAgente().isPokemonsRecuperados() == false</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean BatlhaPerder_cond_0() {
        return (AgenteMapa_1.getAgente().isPokemonsRecuperados() == false);
    }

    /**
     * Checks whether some conditions of rule BatlhaPerder is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean BatlhaPerder_cond(int index) {
        switch (index) {
            case 0: return BatlhaPerder_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule BatlhaPerder that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_BatlhaPerder(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!BatlhaPerder_cond_0()) return false;
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
    private boolean checkCondForDeclaration_BatlhaPerder(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule BatlhaPerder
     */
    private void BatlhaPerder() {
		      System.out.println("Voc� perdeu a batalham.");
		      AgenteMapa_1.getAgente().setCustoAcao(-1000);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule BatalhaGanhar
     */
    private String[] identifiers_BatalhaGanhar = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule BatalhaGanhar
     *
     * @return the identifiers declared in rule BatalhaGanhar
     */
    private String[] getDeclaredIdentifiers_BatalhaGanhar() {
         return identifiers_BatalhaGanhar;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule BatalhaGanhar.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_BatalhaGanhar(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule BatalhaGanhar.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_BatalhaGanhar(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule BatalhaGanhar.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_BatalhaGanhar(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule BatalhaGanhar.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_BatalhaGanhar(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule BatalhaGanhar
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_BatalhaGanhar() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule BatalhaGanhar
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_BatalhaGanhar(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule BatalhaGanhar.<p>
     * The original expression was:<br>
     * <code>am.getAgente().isPokemonsRecuperados() == true</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean BatalhaGanhar_cond_0() {
        return (AgenteMapa_1.getAgente().isPokemonsRecuperados() == true);
    }

    /**
     * Checks whether some conditions of rule BatalhaGanhar is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean BatalhaGanhar_cond(int index) {
        switch (index) {
            case 0: return BatalhaGanhar_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule BatalhaGanhar that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_BatalhaGanhar(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!BatalhaGanhar_cond_0()) return false;
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
    private boolean checkCondForDeclaration_BatalhaGanhar(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule BatalhaGanhar
     */
    private void BatalhaGanhar() {
		     // System.out.println("Voc� ganhou a batalha");
		      AgenteMapa_1.getAgente().setCustoAcao(+150);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule AndarCima
     */
    private String[] identifiers_AndarCima = {
        "am",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule AndarCima
     *
     * @return the identifiers declared in rule AndarCima
     */
    private String[] getDeclaredIdentifiers_AndarCima() {
         return identifiers_AndarCima;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule AndarCima.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_AndarCima(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule AndarCima.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_AndarCima(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule AndarCima.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_AndarCima(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule AndarCima.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_AndarCima(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule AndarCima
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_AndarCima() {
        return new Object[] {
                            AgenteMapa_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule AndarCima
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_AndarCima(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule AndarCima.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getOrientacao() == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarCima_cond_0() {
        return (AgenteMapa_1.getAgente().getOrientacao() == 1);
    }

    /**
     * Condition 1 of rule AndarCima.<p>
     * The original expression was:<br>
     * <code>( (am.getMapa()[am.getAgente().getPosicao().getX()][am.getAgente().getPosicao().getY() - 1].getTerreno() == 1 && 
				  am.getAgente().temPokemonAgua()) ||
		    	  (am.getMapa()[am.getAgente().getPosicao().getX()][am.getAgente().getPosicao().getY() - 1].getTerreno() == 5 && 
				  am.getAgente().temPokemonFogo())
				)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarCima_cond_1() {
        return (( (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX()][AgenteMapa_1.getAgente().getPosicao().getY() - 1].getTerreno() == 1 && 
				  AgenteMapa_1.getAgente().temPokemonAgua()) ||
		    	  (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX()][AgenteMapa_1.getAgente().getPosicao().getY() - 1].getTerreno() == 5 && 
				  AgenteMapa_1.getAgente().temPokemonFogo())
				));
    }

    /**
     * Checks whether some conditions of rule AndarCima is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarCima_cond(int index) {
        switch (index) {
            case 0: return AndarCima_cond_0();
            case 1: return AndarCima_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule AndarCima that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_AndarCima(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!AndarCima_cond_0()) return false;
                if (!AndarCima_cond_1()) return false;
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
    private boolean checkCondForDeclaration_AndarCima(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule AndarCima
     */
    private void AndarCima() {
		      System.out.println("O agente andou para cima");
		      Vector_1 = AgenteMapa_1.getAgente().getPosicao();
		      Vector v = new Vector(Vector_1.getX(), Vector_1.getY() - 1);
		      AgenteMapa_1.getAgente().setPosicao(v);
		      AgenteMapa_1.getAgente().setCustoAcao(-1);
		      AgenteMapa_1.getAgente().setDecisao(AgenteMapa_1.getAgente().ANDAR_ALEATORIAMENTE);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule AndarBaixo
     */
    private String[] identifiers_AndarBaixo = {
        "am",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule AndarBaixo
     *
     * @return the identifiers declared in rule AndarBaixo
     */
    private String[] getDeclaredIdentifiers_AndarBaixo() {
         return identifiers_AndarBaixo;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule AndarBaixo.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_AndarBaixo(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule AndarBaixo.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_AndarBaixo(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule AndarBaixo.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_AndarBaixo(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule AndarBaixo.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_AndarBaixo(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule AndarBaixo
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_AndarBaixo() {
        return new Object[] {
                            AgenteMapa_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule AndarBaixo
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_AndarBaixo(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule AndarBaixo.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getOrientacao() == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarBaixo_cond_0() {
        return (AgenteMapa_1.getAgente().getOrientacao() == 2);
    }

    /**
     * Condition 1 of rule AndarBaixo.<p>
     * The original expression was:<br>
     * <code>( (am.getMapa()[am.getAgente().getPosicao().getX()][am.getAgente().getPosicao().getY() + 1].getTerreno() == 1 && 
				  am.getAgente().temPokemonAgua()) ||
		    	  (am.getMapa()[am.getAgente().getPosicao().getX()][am.getAgente().getPosicao().getY() + 1].getTerreno() == 5 && 
				  am.getAgente().temPokemonFogo())
				)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarBaixo_cond_1() {
        return (( (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX()][AgenteMapa_1.getAgente().getPosicao().getY() + 1].getTerreno() == 1 && 
				  AgenteMapa_1.getAgente().temPokemonAgua()) ||
		    	  (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX()][AgenteMapa_1.getAgente().getPosicao().getY() + 1].getTerreno() == 5 && 
				  AgenteMapa_1.getAgente().temPokemonFogo())
				));
    }

    /**
     * Checks whether some conditions of rule AndarBaixo is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarBaixo_cond(int index) {
        switch (index) {
            case 0: return AndarBaixo_cond_0();
            case 1: return AndarBaixo_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule AndarBaixo that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_AndarBaixo(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!AndarBaixo_cond_0()) return false;
                if (!AndarBaixo_cond_1()) return false;
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
    private boolean checkCondForDeclaration_AndarBaixo(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule AndarBaixo
     */
    private void AndarBaixo() {
		      System.out.println("O agente andou para baixo");
		      Vector_1 = AgenteMapa_1.getAgente().getPosicao();
		      Vector v = new Vector(Vector_1.getX(), Vector_1.getY() + 1);
		      AgenteMapa_1.getAgente().setPosicao(v);
		      AgenteMapa_1.getAgente().setCustoAcao(-1);
		      AgenteMapa_1.getAgente().setDecisao(AgenteMapa_1.getAgente().ANDAR_ALEATORIAMENTE);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule AndarDireita
     */
    private String[] identifiers_AndarDireita = {
        "am",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule AndarDireita
     *
     * @return the identifiers declared in rule AndarDireita
     */
    private String[] getDeclaredIdentifiers_AndarDireita() {
         return identifiers_AndarDireita;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule AndarDireita.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_AndarDireita(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule AndarDireita.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_AndarDireita(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule AndarDireita.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_AndarDireita(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule AndarDireita.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_AndarDireita(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule AndarDireita
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_AndarDireita() {
        return new Object[] {
                            AgenteMapa_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule AndarDireita
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_AndarDireita(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule AndarDireita.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getOrientacao() == 3</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarDireita_cond_0() {
        return (AgenteMapa_1.getAgente().getOrientacao() == 3);
    }

    /**
     * Condition 1 of rule AndarDireita.<p>
     * The original expression was:<br>
     * <code>( (am.getMapa()[am.getAgente().getPosicao().getX() + 1][am.getAgente().getPosicao().getY()].getTerreno() == 1 && 
				  am.getAgente().temPokemonAgua()) ||
		    	  (am.getMapa()[am.getAgente().getPosicao().getX() + 1][am.getAgente().getPosicao().getY()].getTerreno() == 5 && 
				  am.getAgente().temPokemonFogo())
				)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarDireita_cond_1() {
        return (( (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX() + 1][AgenteMapa_1.getAgente().getPosicao().getY()].getTerreno() == 1 && 
				  AgenteMapa_1.getAgente().temPokemonAgua()) ||
		    	  (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX() + 1][AgenteMapa_1.getAgente().getPosicao().getY()].getTerreno() == 5 && 
				  AgenteMapa_1.getAgente().temPokemonFogo())
				));
    }

    /**
     * Checks whether some conditions of rule AndarDireita is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarDireita_cond(int index) {
        switch (index) {
            case 0: return AndarDireita_cond_0();
            case 1: return AndarDireita_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule AndarDireita that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_AndarDireita(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!AndarDireita_cond_0()) return false;
                if (!AndarDireita_cond_1()) return false;
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
    private boolean checkCondForDeclaration_AndarDireita(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule AndarDireita
     */
    private void AndarDireita() {
		      System.out.println("O agente andou para direita");
		      Vector_1 = AgenteMapa_1.getAgente().getPosicao();
		      Vector v = new Vector(Vector_1.getX() + 1, Vector_1.getY());
		      AgenteMapa_1.getAgente().setPosicao(v);
		      AgenteMapa_1.getAgente().setCustoAcao(-1);
		      AgenteMapa_1.getAgente().setDecisao(AgenteMapa_1.getAgente().ANDAR_ALEATORIAMENTE);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule AndarEsquerda
     */
    private String[] identifiers_AndarEsquerda = {
        "am",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule AndarEsquerda
     *
     * @return the identifiers declared in rule AndarEsquerda
     */
    private String[] getDeclaredIdentifiers_AndarEsquerda() {
         return identifiers_AndarEsquerda;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule AndarEsquerda.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_AndarEsquerda(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule AndarEsquerda.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_AndarEsquerda(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule AndarEsquerda.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_AndarEsquerda(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule AndarEsquerda.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_AndarEsquerda(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule AndarEsquerda
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_AndarEsquerda() {
        return new Object[] {
                            AgenteMapa_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule AndarEsquerda
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_AndarEsquerda(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule AndarEsquerda.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getOrientacao() == 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarEsquerda_cond_0() {
        return (AgenteMapa_1.getAgente().getOrientacao() == 4);
    }

    /**
     * Condition 1 of rule AndarEsquerda.<p>
     * The original expression was:<br>
     * <code>( (am.getMapa()[am.getAgente().getPosicao().getX() - 1][am.getAgente().getPosicao().getY()].getTerreno() == 1 && 
				  am.getAgente().temPokemonAgua()) ||
		    	  (am.getMapa()[am.getAgente().getPosicao().getX() - 1][am.getAgente().getPosicao().getY()].getTerreno() == 5 && 
				  am.getAgente().temPokemonFogo())
				)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarEsquerda_cond_1() {
        return (( (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX() - 1][AgenteMapa_1.getAgente().getPosicao().getY()].getTerreno() == 1 && 
				  AgenteMapa_1.getAgente().temPokemonAgua()) ||
		    	  (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX() - 1][AgenteMapa_1.getAgente().getPosicao().getY()].getTerreno() == 5 && 
				  AgenteMapa_1.getAgente().temPokemonFogo())
				));
    }

    /**
     * Checks whether some conditions of rule AndarEsquerda is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarEsquerda_cond(int index) {
        switch (index) {
            case 0: return AndarEsquerda_cond_0();
            case 1: return AndarEsquerda_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule AndarEsquerda that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_AndarEsquerda(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!AndarEsquerda_cond_0()) return false;
                if (!AndarEsquerda_cond_1()) return false;
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
    private boolean checkCondForDeclaration_AndarEsquerda(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule AndarEsquerda
     */
    private void AndarEsquerda() {
		      System.out.println("O agente andou para esquerda");
		      Vector_1 = AgenteMapa_1.getAgente().getPosicao();
		      Vector v = new Vector(Vector_1.getX() - 1, Vector_1.getY());
		      AgenteMapa_1.getAgente().setPosicao(v);
		      AgenteMapa_1.getAgente().setCustoAcao(-1);
		      AgenteMapa_1.getAgente().setDecisao(AgenteMapa_1.getAgente().ANDAR_ALEATORIAMENTE);
		      modified(AgenteMapa_1);
		      }


  
    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "DecisaoUsarPokebola",
        "DecisaoAndarAleatoriamente",
        "DecisaoBatalhar",
        "DecisaoRecuperarPokemons",
        "DecisaoComprarPokebolas",
        "BatlhaPerder",
        "BatalhaGanhar",
        "AndarCima",
        "AndarBaixo",
        "AndarDireita",
        "AndarEsquerda"
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
        1,
        1,
        1,
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
        2,
        5,
        7,
        6,
        3,
        1,
        1,
        2,
        2,
        2,
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
            case 0: return DecisaoUsarPokebola_cond(condIndex);
            case 1: return DecisaoAndarAleatoriamente_cond(condIndex);
            case 2: return DecisaoBatalhar_cond(condIndex);
            case 3: return DecisaoRecuperarPokemons_cond(condIndex);
            case 4: return DecisaoComprarPokebolas_cond(condIndex);
            case 5: return BatlhaPerder_cond(condIndex);
            case 6: return BatalhaGanhar_cond(condIndex);
            case 7: return AndarCima_cond(condIndex);
            case 8: return AndarBaixo_cond(condIndex);
            case 9: return AndarDireita_cond(condIndex);
            case 10: return AndarEsquerda_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_DecisaoUsarPokebola(declIndex);
            case 1: return checkConditionsOnlyOf_DecisaoAndarAleatoriamente(declIndex);
            case 2: return checkConditionsOnlyOf_DecisaoBatalhar(declIndex);
            case 3: return checkConditionsOnlyOf_DecisaoRecuperarPokemons(declIndex);
            case 4: return checkConditionsOnlyOf_DecisaoComprarPokebolas(declIndex);
            case 5: return checkConditionsOnlyOf_BatlhaPerder(declIndex);
            case 6: return checkConditionsOnlyOf_BatalhaGanhar(declIndex);
            case 7: return checkConditionsOnlyOf_AndarCima(declIndex);
            case 8: return checkConditionsOnlyOf_AndarBaixo(declIndex);
            case 9: return checkConditionsOnlyOf_AndarDireita(declIndex);
            case 10: return checkConditionsOnlyOf_AndarEsquerda(declIndex);
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
            case 0: return checkCondForDeclaration_DecisaoUsarPokebola(declIndex);
            case 1: return checkCondForDeclaration_DecisaoAndarAleatoriamente(declIndex);
            case 2: return checkCondForDeclaration_DecisaoBatalhar(declIndex);
            case 3: return checkCondForDeclaration_DecisaoRecuperarPokemons(declIndex);
            case 4: return checkCondForDeclaration_DecisaoComprarPokebolas(declIndex);
            case 5: return checkCondForDeclaration_BatlhaPerder(declIndex);
            case 6: return checkCondForDeclaration_BatalhaGanhar(declIndex);
            case 7: return checkCondForDeclaration_AndarCima(declIndex);
            case 8: return checkCondForDeclaration_AndarBaixo(declIndex);
            case 9: return checkCondForDeclaration_AndarDireita(declIndex);
            case 10: return checkCondForDeclaration_AndarEsquerda(declIndex);
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
            case 0: return getDeclaredClassName_DecisaoUsarPokebola(declIndex);
            case 1: return getDeclaredClassName_DecisaoAndarAleatoriamente(declIndex);
            case 2: return getDeclaredClassName_DecisaoBatalhar(declIndex);
            case 3: return getDeclaredClassName_DecisaoRecuperarPokemons(declIndex);
            case 4: return getDeclaredClassName_DecisaoComprarPokebolas(declIndex);
            case 5: return getDeclaredClassName_BatlhaPerder(declIndex);
            case 6: return getDeclaredClassName_BatalhaGanhar(declIndex);
            case 7: return getDeclaredClassName_AndarCima(declIndex);
            case 8: return getDeclaredClassName_AndarBaixo(declIndex);
            case 9: return getDeclaredClassName_AndarDireita(declIndex);
            case 10: return getDeclaredClassName_AndarEsquerda(declIndex);
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
            case 0: return getDeclaredClass_DecisaoUsarPokebola(declIndex);
            case 1: return getDeclaredClass_DecisaoAndarAleatoriamente(declIndex);
            case 2: return getDeclaredClass_DecisaoBatalhar(declIndex);
            case 3: return getDeclaredClass_DecisaoRecuperarPokemons(declIndex);
            case 4: return getDeclaredClass_DecisaoComprarPokebolas(declIndex);
            case 5: return getDeclaredClass_BatlhaPerder(declIndex);
            case 6: return getDeclaredClass_BatalhaGanhar(declIndex);
            case 7: return getDeclaredClass_AndarCima(declIndex);
            case 8: return getDeclaredClass_AndarBaixo(declIndex);
            case 9: return getDeclaredClass_AndarDireita(declIndex);
            case 10: return getDeclaredClass_AndarEsquerda(declIndex);
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
            case 0: DecisaoUsarPokebola(); break;
            case 1: DecisaoAndarAleatoriamente(); break;
            case 2: DecisaoBatalhar(); break;
            case 3: DecisaoRecuperarPokemons(); break;
            case 4: DecisaoComprarPokebolas(); break;
            case 5: BatlhaPerder(); break;
            case 6: BatalhaGanhar(); break;
            case 7: AndarCima(); break;
            case 8: AndarBaixo(); break;
            case 9: AndarDireita(); break;
            case 10: AndarEsquerda(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 11;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_DecisaoUsarPokebola();
            case 1: return getDeclaredIdentifiers_DecisaoAndarAleatoriamente();
            case 2: return getDeclaredIdentifiers_DecisaoBatalhar();
            case 3: return getDeclaredIdentifiers_DecisaoRecuperarPokemons();
            case 4: return getDeclaredIdentifiers_DecisaoComprarPokebolas();
            case 5: return getDeclaredIdentifiers_BatlhaPerder();
            case 6: return getDeclaredIdentifiers_BatalhaGanhar();
            case 7: return getDeclaredIdentifiers_AndarCima();
            case 8: return getDeclaredIdentifiers_AndarBaixo();
            case 9: return getDeclaredIdentifiers_AndarDireita();
            case 10: return getDeclaredIdentifiers_AndarEsquerda();
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
            case 0: setObject_DecisaoUsarPokebola(declIndex, value); break;
            case 1: setObject_DecisaoAndarAleatoriamente(declIndex, value); break;
            case 2: setObject_DecisaoBatalhar(declIndex, value); break;
            case 3: setObject_DecisaoRecuperarPokemons(declIndex, value); break;
            case 4: setObject_DecisaoComprarPokebolas(declIndex, value); break;
            case 5: setObject_BatlhaPerder(declIndex, value); break;
            case 6: setObject_BatalhaGanhar(declIndex, value); break;
            case 7: setObject_AndarCima(declIndex, value); break;
            case 8: setObject_AndarBaixo(declIndex, value); break;
            case 9: setObject_AndarDireita(declIndex, value); break;
            case 10: setObject_AndarEsquerda(declIndex, value); break;
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
            case 0: return getObject_DecisaoUsarPokebola(declIndex);
            case 1: return getObject_DecisaoAndarAleatoriamente(declIndex);
            case 2: return getObject_DecisaoBatalhar(declIndex);
            case 3: return getObject_DecisaoRecuperarPokemons(declIndex);
            case 4: return getObject_DecisaoComprarPokebolas(declIndex);
            case 5: return getObject_BatlhaPerder(declIndex);
            case 6: return getObject_BatalhaGanhar(declIndex);
            case 7: return getObject_AndarCima(declIndex);
            case 8: return getObject_AndarBaixo(declIndex);
            case 9: return getObject_AndarDireita(declIndex);
            case 10: return getObject_AndarEsquerda(declIndex);
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
            case 0: return getObjects_DecisaoUsarPokebola();
            case 1: return getObjects_DecisaoAndarAleatoriamente();
            case 2: return getObjects_DecisaoBatalhar();
            case 3: return getObjects_DecisaoRecuperarPokemons();
            case 4: return getObjects_DecisaoComprarPokebolas();
            case 5: return getObjects_BatlhaPerder();
            case 6: return getObjects_BatalhaGanhar();
            case 7: return getObjects_AndarCima();
            case 8: return getObjects_AndarBaixo();
            case 9: return getObjects_AndarDireita();
            case 10: return getObjects_AndarEsquerda();
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
            case 0: setObjects_DecisaoUsarPokebola(objects); break;
            case 1: setObjects_DecisaoAndarAleatoriamente(objects); break;
            case 2: setObjects_DecisaoBatalhar(objects); break;
            case 3: setObjects_DecisaoRecuperarPokemons(objects); break;
            case 4: setObjects_DecisaoComprarPokebolas(objects); break;
            case 5: setObjects_BatlhaPerder(objects); break;
            case 6: setObjects_BatalhaGanhar(objects); break;
            case 7: setObjects_AndarCima(objects); break;
            case 8: setObjects_AndarBaixo(objects); break;
            case 9: setObjects_AndarDireita(objects); break;
            case 10: setObjects_AndarEsquerda(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private AgenteMapa AgenteMapa_1;
    private Vector Vector_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_RegrasPokemon(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file RegrasPokemon.rules
 *
 * @version Jul 5, 2017
 */
public class RegrasPokemon extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public RegrasPokemon(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public RegrasPokemon() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_RegrasPokemon(this);
    }

}
