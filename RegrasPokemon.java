   class Jeops_RuleBase_RegrasPokemon extends jeops.AbstractRuleBase {
 
 		
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
     * <code>am.getMapaElemento().existeElementoProximo(am.getAgente().getPosicao()) == false</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarAleatoriamente_cond_0() {
        return (AgenteMapa_1.getMapaElemento().existeElementoProximo(AgenteMapa_1.getAgente().getPosicao()) == false);
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
		      AgenteMapa_1.getAgente().setDecisao(AgenteMapa_1.getAgente().ANDAR_ALEATORIAMENTE);
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
     * <code>am.getAgente().getQuantidadePokebolas() > 0</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean UsarPokebola_cond_0() {
        return (AgenteMapa_1.getAgente().getQuantidadePokebolas() > 0);
    }

    /**
     * Condition 1 of rule UsarPokebola.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existeElementoPosAtual(am.getAgente().getPosicao()) >= 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean UsarPokebola_cond_1() {
        return (AgenteMapa_1.getMapaElemento().existeElementoPosAtual(AgenteMapa_1.getAgente().getPosicao()) >= 4);
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
		      	System.out.println("O agente capturou um pokemon.");
		      	AgenteMapa_1.getAgente().setQuantidadePokebolas(AgenteMapa_1.getAgente().getQuantidadePokebolas() - 1);
		      	AgenteMapa_1.getAgente().setCustoAcao(-5);
		      	AgenteMapa_1.getAgente().setDecisao(2);
		      	modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule DecisaoIrPraCelula
     */
    private String[] identifiers_DecisaoIrPraCelula = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule DecisaoIrPraCelula
     *
     * @return the identifiers declared in rule DecisaoIrPraCelula
     */
    private String[] getDeclaredIdentifiers_DecisaoIrPraCelula() {
         return identifiers_DecisaoIrPraCelula;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule DecisaoIrPraCelula.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_DecisaoIrPraCelula(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule DecisaoIrPraCelula.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_DecisaoIrPraCelula(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule DecisaoIrPraCelula.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_DecisaoIrPraCelula(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule DecisaoIrPraCelula.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_DecisaoIrPraCelula(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule DecisaoIrPraCelula
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_DecisaoIrPraCelula() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule DecisaoIrPraCelula
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_DecisaoIrPraCelula(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule DecisaoIrPraCelula.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().temElementoProximo(am.getAgente().getPosicao()) == true</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoIrPraCelula_cond_0() {
        return (AgenteMapa_1.getMapaElemento().temElementoProximo(AgenteMapa_1.getAgente().getPosicao()) == true);
    }

    /**
     * Checks whether some conditions of rule DecisaoIrPraCelula is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean DecisaoIrPraCelula_cond(int index) {
        switch (index) {
            case 0: return DecisaoIrPraCelula_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule DecisaoIrPraCelula that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_DecisaoIrPraCelula(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!DecisaoIrPraCelula_cond_0()) return false;
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
    private boolean checkCondForDeclaration_DecisaoIrPraCelula(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule DecisaoIrPraCelula
     */
    private void DecisaoIrPraCelula() {
		      	System.out.println("O agente andou uma celula.");
		      	AgenteMapa_1.getAgente().setCustoAcao(-1);
		      	AgenteMapa_1.getAgente().setDecisao(AgenteMapa_1.getAgente().IR_CELULA);
		      	modified(AgenteMapa_1);
		      }


		  
		 
    /**
     * Identifiers of rule IrPraCelulaACima
     */
    private String[] identifiers_IrPraCelulaACima = {
        "am",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule IrPraCelulaACima
     *
     * @return the identifiers declared in rule IrPraCelulaACima
     */
    private String[] getDeclaredIdentifiers_IrPraCelulaACima() {
         return identifiers_IrPraCelulaACima;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule IrPraCelulaACima.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_IrPraCelulaACima(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule IrPraCelulaACima.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_IrPraCelulaACima(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule IrPraCelulaACima.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_IrPraCelulaACima(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule IrPraCelulaACima.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_IrPraCelulaACima(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule IrPraCelulaACima
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_IrPraCelulaACima() {
        return new Object[] {
                            AgenteMapa_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule IrPraCelulaACima
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_IrPraCelulaACima(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule IrPraCelulaACima.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getDecisao() == am.getAgente().IR_CELULA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaACima_cond_0() {
        return (AgenteMapa_1.getAgente().getDecisao() == AgenteMapa_1.getAgente().IR_CELULA);
    }

    /**
     * Condition 1 of rule IrPraCelulaACima.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().getCelulaDirecao() == am.getMapaElemento().CIMA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaACima_cond_1() {
        return (AgenteMapa_1.getMapaElemento().getCelulaDirecao() == AgenteMapa_1.getMapaElemento().CIMA);
    }

    /**
     * Condition 2 of rule IrPraCelulaACima.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getOrientacao() == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaACima_cond_2() {
        return (AgenteMapa_1.getAgente().getOrientacao() == 1);
    }

    /**
     * Condition 3 of rule IrPraCelulaACima.<p>
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
    private boolean IrPraCelulaACima_cond_3() {
        return (( (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX()][AgenteMapa_1.getAgente().getPosicao().getY() - 1].getTerreno() == 1 && 
				  AgenteMapa_1.getAgente().temPokemonAgua()) ||
		    	  (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX()][AgenteMapa_1.getAgente().getPosicao().getY() - 1].getTerreno() == 5 && 
				  AgenteMapa_1.getAgente().temPokemonFogo())
				));
    }

    /**
     * Checks whether some conditions of rule IrPraCelulaACima is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaACima_cond(int index) {
        switch (index) {
            case 0: return IrPraCelulaACima_cond_0();
            case 1: return IrPraCelulaACima_cond_1();
            case 2: return IrPraCelulaACima_cond_2();
            case 3: return IrPraCelulaACima_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule IrPraCelulaACima that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_IrPraCelulaACima(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!IrPraCelulaACima_cond_0()) return false;
                if (!IrPraCelulaACima_cond_1()) return false;
                if (!IrPraCelulaACima_cond_2()) return false;
                if (!IrPraCelulaACima_cond_3()) return false;
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
    private boolean checkCondForDeclaration_IrPraCelulaACima(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule IrPraCelulaACima
     */
    private void IrPraCelulaACima() {
		      System.out.println("O agente andou para cima");
		      Vector_1 = AgenteMapa_1.getAgente().getPosicao();
		      Vector v = new Vector(Vector_1.getX(), Vector_1.getY() - 1);
		      AgenteMapa_1.getAgente().setPosicao(v);
		      AgenteMapa_1.getAgente().setCustoAcao(-1);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule IrPraCelulaBaixo
     */
    private String[] identifiers_IrPraCelulaBaixo = {
        "am",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule IrPraCelulaBaixo
     *
     * @return the identifiers declared in rule IrPraCelulaBaixo
     */
    private String[] getDeclaredIdentifiers_IrPraCelulaBaixo() {
         return identifiers_IrPraCelulaBaixo;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule IrPraCelulaBaixo.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_IrPraCelulaBaixo(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule IrPraCelulaBaixo.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_IrPraCelulaBaixo(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule IrPraCelulaBaixo.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_IrPraCelulaBaixo(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule IrPraCelulaBaixo.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_IrPraCelulaBaixo(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule IrPraCelulaBaixo
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_IrPraCelulaBaixo() {
        return new Object[] {
                            AgenteMapa_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule IrPraCelulaBaixo
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_IrPraCelulaBaixo(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule IrPraCelulaBaixo.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getDecisao() == am.getAgente().IR_CELULA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaBaixo_cond_0() {
        return (AgenteMapa_1.getAgente().getDecisao() == AgenteMapa_1.getAgente().IR_CELULA);
    }

    /**
     * Condition 1 of rule IrPraCelulaBaixo.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().getCelulaDirecao() == am.getMapaElemento().BAIXO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaBaixo_cond_1() {
        return (AgenteMapa_1.getMapaElemento().getCelulaDirecao() == AgenteMapa_1.getMapaElemento().BAIXO);
    }

    /**
     * Condition 2 of rule IrPraCelulaBaixo.<p>
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
    private boolean IrPraCelulaBaixo_cond_2() {
        return (( (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX()][AgenteMapa_1.getAgente().getPosicao().getY() + 1].getTerreno() == 1 && 
				  AgenteMapa_1.getAgente().temPokemonAgua()) ||
		    	  (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX()][AgenteMapa_1.getAgente().getPosicao().getY() + 1].getTerreno() == 5 && 
				  AgenteMapa_1.getAgente().temPokemonFogo())
				));
    }

    /**
     * Checks whether some conditions of rule IrPraCelulaBaixo is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaBaixo_cond(int index) {
        switch (index) {
            case 0: return IrPraCelulaBaixo_cond_0();
            case 1: return IrPraCelulaBaixo_cond_1();
            case 2: return IrPraCelulaBaixo_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule IrPraCelulaBaixo that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_IrPraCelulaBaixo(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!IrPraCelulaBaixo_cond_0()) return false;
                if (!IrPraCelulaBaixo_cond_1()) return false;
                if (!IrPraCelulaBaixo_cond_2()) return false;
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
    private boolean checkCondForDeclaration_IrPraCelulaBaixo(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule IrPraCelulaBaixo
     */
    private void IrPraCelulaBaixo() {
		      System.out.println("O agente andou para baixo");
		      Vector_1 = AgenteMapa_1.getAgente().getPosicao();
		      Vector v = new Vector(Vector_1.getX(), Vector_1.getY() + 1);
		      AgenteMapa_1.getAgente().setPosicao(v);
		      AgenteMapa_1.getAgente().setCustoAcao(-1);
		      AgenteMapa_1.getAgente().setDecisao(AgenteMapa_1.getAgente().ANDAR_ALEATORIAMENTE);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule IrParaCelulaDireita
     */
    private String[] identifiers_IrParaCelulaDireita = {
        "am",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule IrParaCelulaDireita
     *
     * @return the identifiers declared in rule IrParaCelulaDireita
     */
    private String[] getDeclaredIdentifiers_IrParaCelulaDireita() {
         return identifiers_IrParaCelulaDireita;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule IrParaCelulaDireita.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_IrParaCelulaDireita(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule IrParaCelulaDireita.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_IrParaCelulaDireita(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule IrParaCelulaDireita.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_IrParaCelulaDireita(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule IrParaCelulaDireita.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_IrParaCelulaDireita(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule IrParaCelulaDireita
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_IrParaCelulaDireita() {
        return new Object[] {
                            AgenteMapa_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule IrParaCelulaDireita
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_IrParaCelulaDireita(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule IrParaCelulaDireita.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getDecisao() == am.getAgente().IR_CELULA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrParaCelulaDireita_cond_0() {
        return (AgenteMapa_1.getAgente().getDecisao() == AgenteMapa_1.getAgente().IR_CELULA);
    }

    /**
     * Condition 1 of rule IrParaCelulaDireita.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().getCelulaDirecao() == am.getMapaElemento().DIREITA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrParaCelulaDireita_cond_1() {
        return (AgenteMapa_1.getMapaElemento().getCelulaDirecao() == AgenteMapa_1.getMapaElemento().DIREITA);
    }

    /**
     * Condition 2 of rule IrParaCelulaDireita.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getOrientacao() == 3</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrParaCelulaDireita_cond_2() {
        return (AgenteMapa_1.getAgente().getOrientacao() == 3);
    }

    /**
     * Condition 3 of rule IrParaCelulaDireita.<p>
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
    private boolean IrParaCelulaDireita_cond_3() {
        return (( (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX() + 1][AgenteMapa_1.getAgente().getPosicao().getY()].getTerreno() == 1 && 
				  AgenteMapa_1.getAgente().temPokemonAgua()) ||
		    	  (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX() + 1][AgenteMapa_1.getAgente().getPosicao().getY()].getTerreno() == 5 && 
				  AgenteMapa_1.getAgente().temPokemonFogo())
				));
    }

    /**
     * Checks whether some conditions of rule IrParaCelulaDireita is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrParaCelulaDireita_cond(int index) {
        switch (index) {
            case 0: return IrParaCelulaDireita_cond_0();
            case 1: return IrParaCelulaDireita_cond_1();
            case 2: return IrParaCelulaDireita_cond_2();
            case 3: return IrParaCelulaDireita_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule IrParaCelulaDireita that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_IrParaCelulaDireita(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!IrParaCelulaDireita_cond_0()) return false;
                if (!IrParaCelulaDireita_cond_1()) return false;
                if (!IrParaCelulaDireita_cond_2()) return false;
                if (!IrParaCelulaDireita_cond_3()) return false;
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
    private boolean checkCondForDeclaration_IrParaCelulaDireita(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule IrParaCelulaDireita
     */
    private void IrParaCelulaDireita() {
		      System.out.println("O agente andou para direita");
		      Vector_1 = AgenteMapa_1.getAgente().getPosicao();
		      Vector v = new Vector(Vector_1.getX() + 1, Vector_1.getY());
		      AgenteMapa_1.getAgente().setPosicao(v);
		      AgenteMapa_1.getAgente().setCustoAcao(-1);
		      AgenteMapa_1.getAgente().setDecisao(AgenteMapa_1.getAgente().ANDAR_ALEATORIAMENTE);
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule IrPraCelulaEsquerda
     */
    private String[] identifiers_IrPraCelulaEsquerda = {
        "am",
        "posicaoAtual"
    };

    /**
     * Returns the identifiers declared in rule IrPraCelulaEsquerda
     *
     * @return the identifiers declared in rule IrPraCelulaEsquerda
     */
    private String[] getDeclaredIdentifiers_IrPraCelulaEsquerda() {
         return identifiers_IrPraCelulaEsquerda;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule IrPraCelulaEsquerda.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_IrPraCelulaEsquerda(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            case 1: return "Vector";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule IrPraCelulaEsquerda.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_IrPraCelulaEsquerda(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            case 1: return Vector.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule IrPraCelulaEsquerda.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_IrPraCelulaEsquerda(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
            case 1: this.Vector_1 = (Vector) value; break;
        }
    }

    /**
     * Returns an object declared in the rule IrPraCelulaEsquerda.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_IrPraCelulaEsquerda(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            case 1: return Vector_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule IrPraCelulaEsquerda
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_IrPraCelulaEsquerda() {
        return new Object[] {
                            AgenteMapa_1,
                            Vector_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule IrPraCelulaEsquerda
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_IrPraCelulaEsquerda(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
        Vector_1 = (Vector) objects[1];
    }

    /**
     * Condition 0 of rule IrPraCelulaEsquerda.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getDecisao() == am.getAgente().IR_CELULA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaEsquerda_cond_0() {
        return (AgenteMapa_1.getAgente().getDecisao() == AgenteMapa_1.getAgente().IR_CELULA);
    }

    /**
     * Condition 1 of rule IrPraCelulaEsquerda.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().getCelulaDirecao() == am.getMapaElemento().ESQUERDA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaEsquerda_cond_1() {
        return (AgenteMapa_1.getMapaElemento().getCelulaDirecao() == AgenteMapa_1.getMapaElemento().ESQUERDA);
    }

    /**
     * Condition 2 of rule IrPraCelulaEsquerda.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getOrientacao() == 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaEsquerda_cond_2() {
        return (AgenteMapa_1.getAgente().getOrientacao() == 4);
    }

    /**
     * Condition 3 of rule IrPraCelulaEsquerda.<p>
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
    private boolean IrPraCelulaEsquerda_cond_3() {
        return (( (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX() - 1][AgenteMapa_1.getAgente().getPosicao().getY()].getTerreno() == 1 && 
				  AgenteMapa_1.getAgente().temPokemonAgua()) ||
		    	  (AgenteMapa_1.getMapa()[AgenteMapa_1.getAgente().getPosicao().getX() - 1][AgenteMapa_1.getAgente().getPosicao().getY()].getTerreno() == 5 && 
				  AgenteMapa_1.getAgente().temPokemonFogo())
				));
    }

    /**
     * Checks whether some conditions of rule IrPraCelulaEsquerda is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean IrPraCelulaEsquerda_cond(int index) {
        switch (index) {
            case 0: return IrPraCelulaEsquerda_cond_0();
            case 1: return IrPraCelulaEsquerda_cond_1();
            case 2: return IrPraCelulaEsquerda_cond_2();
            case 3: return IrPraCelulaEsquerda_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule IrPraCelulaEsquerda that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_IrPraCelulaEsquerda(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!IrPraCelulaEsquerda_cond_0()) return false;
                if (!IrPraCelulaEsquerda_cond_1()) return false;
                if (!IrPraCelulaEsquerda_cond_2()) return false;
                if (!IrPraCelulaEsquerda_cond_3()) return false;
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
    private boolean checkCondForDeclaration_IrPraCelulaEsquerda(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule IrPraCelulaEsquerda
     */
    private void IrPraCelulaEsquerda() {
		      System.out.println("O agente andou para esquerda");
		      Vector_1 = AgenteMapa_1.getAgente().getPosicao();
		      Vector v = new Vector(Vector_1.getX() - 1, Vector_1.getY());
		      AgenteMapa_1.getAgente().setPosicao(v);
		      AgenteMapa_1.getAgente().setCustoAcao(-1);
		      AgenteMapa_1.getAgente().setDecisao(AgenteMapa_1.getAgente().ANDAR_ALEATORIAMENTE);
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
     * Identifiers of rule recuperarPokemons
     */
    private String[] identifiers_recuperarPokemons = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule recuperarPokemons
     *
     * @return the identifiers declared in rule recuperarPokemons
     */
    private String[] getDeclaredIdentifiers_recuperarPokemons() {
         return identifiers_recuperarPokemons;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule recuperarPokemons.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_recuperarPokemons(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule recuperarPokemons.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_recuperarPokemons(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule recuperarPokemons.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_recuperarPokemons(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule recuperarPokemons.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_recuperarPokemons(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule recuperarPokemons
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_recuperarPokemons() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule recuperarPokemons
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_recuperarPokemons(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule recuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getDecisao() != am.getAgente().RECUPERAR_POKEMONS</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean recuperarPokemons_cond_0() {
        return (AgenteMapa_1.getAgente().getDecisao() != AgenteMapa_1.getAgente().RECUPERAR_POKEMONS);
    }

    /**
     * Condition 1 of rule recuperarPokemons.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existeElementoPosAtual(am.getAgente().getPosicao()) == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean recuperarPokemons_cond_1() {
        return (AgenteMapa_1.getMapaElemento().existeElementoPosAtual(AgenteMapa_1.getAgente().getPosicao()) == 1);
    }

    /**
     * Condition 2 of rule recuperarPokemons.<p>
     * The original expression was:<br>
     * <code>!am.getAgente().isPokemonsRecuperados()</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean recuperarPokemons_cond_2() {
        return (!AgenteMapa_1.getAgente().isPokemonsRecuperados());
    }

    /**
     * Checks whether some conditions of rule recuperarPokemons is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean recuperarPokemons_cond(int index) {
        switch (index) {
            case 0: return recuperarPokemons_cond_0();
            case 1: return recuperarPokemons_cond_1();
            case 2: return recuperarPokemons_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule recuperarPokemons that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_recuperarPokemons(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!recuperarPokemons_cond_0()) return false;
                if (!recuperarPokemons_cond_1()) return false;
                if (!recuperarPokemons_cond_2()) return false;
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
    private boolean checkCondForDeclaration_recuperarPokemons(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule recuperarPokemons
     */
    private void recuperarPokemons() {
		      AgenteMapa_1.getAgente().setDecisao(4);
		      AgenteMapa_1.getAgente().setCustoAcao(-100);
		      AgenteMapa_1.getAgente().setPokemonsRecuperados(true); 
		      System.out.println("recuperar pokemons");
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule comprarPokebolas
     */
    private String[] identifiers_comprarPokebolas = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule comprarPokebolas
     *
     * @return the identifiers declared in rule comprarPokebolas
     */
    private String[] getDeclaredIdentifiers_comprarPokebolas() {
         return identifiers_comprarPokebolas;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule comprarPokebolas.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_comprarPokebolas(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule comprarPokebolas.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_comprarPokebolas(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule comprarPokebolas.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_comprarPokebolas(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule comprarPokebolas.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_comprarPokebolas(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule comprarPokebolas
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_comprarPokebolas() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule comprarPokebolas
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_comprarPokebolas(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule comprarPokebolas.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getDecisao() != am.getAgente().COMPRAR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean comprarPokebolas_cond_0() {
        return (AgenteMapa_1.getAgente().getDecisao() != AgenteMapa_1.getAgente().COMPRAR);
    }

    /**
     * Condition 1 of rule comprarPokebolas.<p>
     * The original expression was:<br>
     * <code>am.getMapaElemento().existeElementoPosAtual(am.getAgente().getPosicao()) == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean comprarPokebolas_cond_1() {
        return (AgenteMapa_1.getMapaElemento().existeElementoPosAtual(AgenteMapa_1.getAgente().getPosicao()) == 2);
    }

    /**
     * Condition 2 of rule comprarPokebolas.<p>
     * The original expression was:<br>
     * <code>am.getAgente().getQuantidadePokebolas() == 0</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean comprarPokebolas_cond_2() {
        return (AgenteMapa_1.getAgente().getQuantidadePokebolas() == 0);
    }

    /**
     * Checks whether some conditions of rule comprarPokebolas is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean comprarPokebolas_cond(int index) {
        switch (index) {
            case 0: return comprarPokebolas_cond_0();
            case 1: return comprarPokebolas_cond_1();
            case 2: return comprarPokebolas_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule comprarPokebolas that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_comprarPokebolas(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!comprarPokebolas_cond_0()) return false;
                if (!comprarPokebolas_cond_1()) return false;
                if (!comprarPokebolas_cond_2()) return false;
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
    private boolean checkCondForDeclaration_comprarPokebolas(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule comprarPokebolas
     */
    private void comprarPokebolas() {
		      AgenteMapa_1.getAgente().setDecisao(5);
		      AgenteMapa_1.getAgente().addPokebolas(25);
		      System.out.println("comprar pokebolas");
		      modified(AgenteMapa_1);
		      }


		  
		  
    /**
     * Identifiers of rule BatalhaPerder
     */
    private String[] identifiers_BatalhaPerder = {
        "am"
    };

    /**
     * Returns the identifiers declared in rule BatalhaPerder
     *
     * @return the identifiers declared in rule BatalhaPerder
     */
    private String[] getDeclaredIdentifiers_BatalhaPerder() {
         return identifiers_BatalhaPerder;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule BatalhaPerder.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_BatalhaPerder(int index) {
        switch (index) {
            case 0: return "AgenteMapa";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule BatalhaPerder.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_BatalhaPerder(int index) {
        switch (index) {
            case 0: return AgenteMapa.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule BatalhaPerder.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_BatalhaPerder(int index, Object value) {
        switch (index) {
            case 0: this.AgenteMapa_1 = (AgenteMapa) value; break;
        }
    }

    /**
     * Returns an object declared in the rule BatalhaPerder.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_BatalhaPerder(int index) {
        switch (index) {
            case 0: return AgenteMapa_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule BatalhaPerder
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_BatalhaPerder() {
        return new Object[] {
                            AgenteMapa_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule BatalhaPerder
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_BatalhaPerder(Object[] objects) {
        AgenteMapa_1 = (AgenteMapa) objects[0];
    }

    /**
     * Condition 0 of rule BatalhaPerder.<p>
     * The original expression was:<br>
     * <code>am.getAgente().isPokemonsRecuperados() == false</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean BatalhaPerder_cond_0() {
        return (AgenteMapa_1.getAgente().isPokemonsRecuperados() == false);
    }

    /**
     * Checks whether some conditions of rule BatalhaPerder is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean BatalhaPerder_cond(int index) {
        switch (index) {
            case 0: return BatalhaPerder_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule BatalhaPerder that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_BatalhaPerder(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!BatalhaPerder_cond_0()) return false;
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
    private boolean checkCondForDeclaration_BatalhaPerder(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule BatalhaPerder
     */
    private void BatalhaPerder() {
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
		      System.out.println("Voc� ganhou a batalha");
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
        "AndarAleatoriamente",
        "UsarPokebola",
        "DecisaoIrPraCelula",
        "IrPraCelulaACima",
        "IrPraCelulaBaixo",
        "IrParaCelulaDireita",
        "IrPraCelulaEsquerda",
        "DecisaoBatalhar",
        "recuperarPokemons",
        "comprarPokebolas",
        "BatalhaPerder",
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
        2,
        2,
        2,
        2,
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
        1,
        2,
        1,
        4,
        3,
        4,
        4,
        7,
        3,
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
            case 0: return AndarAleatoriamente_cond(condIndex);
            case 1: return UsarPokebola_cond(condIndex);
            case 2: return DecisaoIrPraCelula_cond(condIndex);
            case 3: return IrPraCelulaACima_cond(condIndex);
            case 4: return IrPraCelulaBaixo_cond(condIndex);
            case 5: return IrParaCelulaDireita_cond(condIndex);
            case 6: return IrPraCelulaEsquerda_cond(condIndex);
            case 7: return DecisaoBatalhar_cond(condIndex);
            case 8: return recuperarPokemons_cond(condIndex);
            case 9: return comprarPokebolas_cond(condIndex);
            case 10: return BatalhaPerder_cond(condIndex);
            case 11: return BatalhaGanhar_cond(condIndex);
            case 12: return AndarCima_cond(condIndex);
            case 13: return AndarBaixo_cond(condIndex);
            case 14: return AndarDireita_cond(condIndex);
            case 15: return AndarEsquerda_cond(condIndex);
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
            case 2: return checkConditionsOnlyOf_DecisaoIrPraCelula(declIndex);
            case 3: return checkConditionsOnlyOf_IrPraCelulaACima(declIndex);
            case 4: return checkConditionsOnlyOf_IrPraCelulaBaixo(declIndex);
            case 5: return checkConditionsOnlyOf_IrParaCelulaDireita(declIndex);
            case 6: return checkConditionsOnlyOf_IrPraCelulaEsquerda(declIndex);
            case 7: return checkConditionsOnlyOf_DecisaoBatalhar(declIndex);
            case 8: return checkConditionsOnlyOf_recuperarPokemons(declIndex);
            case 9: return checkConditionsOnlyOf_comprarPokebolas(declIndex);
            case 10: return checkConditionsOnlyOf_BatalhaPerder(declIndex);
            case 11: return checkConditionsOnlyOf_BatalhaGanhar(declIndex);
            case 12: return checkConditionsOnlyOf_AndarCima(declIndex);
            case 13: return checkConditionsOnlyOf_AndarBaixo(declIndex);
            case 14: return checkConditionsOnlyOf_AndarDireita(declIndex);
            case 15: return checkConditionsOnlyOf_AndarEsquerda(declIndex);
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
            case 2: return checkCondForDeclaration_DecisaoIrPraCelula(declIndex);
            case 3: return checkCondForDeclaration_IrPraCelulaACima(declIndex);
            case 4: return checkCondForDeclaration_IrPraCelulaBaixo(declIndex);
            case 5: return checkCondForDeclaration_IrParaCelulaDireita(declIndex);
            case 6: return checkCondForDeclaration_IrPraCelulaEsquerda(declIndex);
            case 7: return checkCondForDeclaration_DecisaoBatalhar(declIndex);
            case 8: return checkCondForDeclaration_recuperarPokemons(declIndex);
            case 9: return checkCondForDeclaration_comprarPokebolas(declIndex);
            case 10: return checkCondForDeclaration_BatalhaPerder(declIndex);
            case 11: return checkCondForDeclaration_BatalhaGanhar(declIndex);
            case 12: return checkCondForDeclaration_AndarCima(declIndex);
            case 13: return checkCondForDeclaration_AndarBaixo(declIndex);
            case 14: return checkCondForDeclaration_AndarDireita(declIndex);
            case 15: return checkCondForDeclaration_AndarEsquerda(declIndex);
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
            case 2: return getDeclaredClassName_DecisaoIrPraCelula(declIndex);
            case 3: return getDeclaredClassName_IrPraCelulaACima(declIndex);
            case 4: return getDeclaredClassName_IrPraCelulaBaixo(declIndex);
            case 5: return getDeclaredClassName_IrParaCelulaDireita(declIndex);
            case 6: return getDeclaredClassName_IrPraCelulaEsquerda(declIndex);
            case 7: return getDeclaredClassName_DecisaoBatalhar(declIndex);
            case 8: return getDeclaredClassName_recuperarPokemons(declIndex);
            case 9: return getDeclaredClassName_comprarPokebolas(declIndex);
            case 10: return getDeclaredClassName_BatalhaPerder(declIndex);
            case 11: return getDeclaredClassName_BatalhaGanhar(declIndex);
            case 12: return getDeclaredClassName_AndarCima(declIndex);
            case 13: return getDeclaredClassName_AndarBaixo(declIndex);
            case 14: return getDeclaredClassName_AndarDireita(declIndex);
            case 15: return getDeclaredClassName_AndarEsquerda(declIndex);
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
            case 2: return getDeclaredClass_DecisaoIrPraCelula(declIndex);
            case 3: return getDeclaredClass_IrPraCelulaACima(declIndex);
            case 4: return getDeclaredClass_IrPraCelulaBaixo(declIndex);
            case 5: return getDeclaredClass_IrParaCelulaDireita(declIndex);
            case 6: return getDeclaredClass_IrPraCelulaEsquerda(declIndex);
            case 7: return getDeclaredClass_DecisaoBatalhar(declIndex);
            case 8: return getDeclaredClass_recuperarPokemons(declIndex);
            case 9: return getDeclaredClass_comprarPokebolas(declIndex);
            case 10: return getDeclaredClass_BatalhaPerder(declIndex);
            case 11: return getDeclaredClass_BatalhaGanhar(declIndex);
            case 12: return getDeclaredClass_AndarCima(declIndex);
            case 13: return getDeclaredClass_AndarBaixo(declIndex);
            case 14: return getDeclaredClass_AndarDireita(declIndex);
            case 15: return getDeclaredClass_AndarEsquerda(declIndex);
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
            case 2: DecisaoIrPraCelula(); break;
            case 3: IrPraCelulaACima(); break;
            case 4: IrPraCelulaBaixo(); break;
            case 5: IrParaCelulaDireita(); break;
            case 6: IrPraCelulaEsquerda(); break;
            case 7: DecisaoBatalhar(); break;
            case 8: recuperarPokemons(); break;
            case 9: comprarPokebolas(); break;
            case 10: BatalhaPerder(); break;
            case 11: BatalhaGanhar(); break;
            case 12: AndarCima(); break;
            case 13: AndarBaixo(); break;
            case 14: AndarDireita(); break;
            case 15: AndarEsquerda(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 16;
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
            case 2: return getDeclaredIdentifiers_DecisaoIrPraCelula();
            case 3: return getDeclaredIdentifiers_IrPraCelulaACima();
            case 4: return getDeclaredIdentifiers_IrPraCelulaBaixo();
            case 5: return getDeclaredIdentifiers_IrParaCelulaDireita();
            case 6: return getDeclaredIdentifiers_IrPraCelulaEsquerda();
            case 7: return getDeclaredIdentifiers_DecisaoBatalhar();
            case 8: return getDeclaredIdentifiers_recuperarPokemons();
            case 9: return getDeclaredIdentifiers_comprarPokebolas();
            case 10: return getDeclaredIdentifiers_BatalhaPerder();
            case 11: return getDeclaredIdentifiers_BatalhaGanhar();
            case 12: return getDeclaredIdentifiers_AndarCima();
            case 13: return getDeclaredIdentifiers_AndarBaixo();
            case 14: return getDeclaredIdentifiers_AndarDireita();
            case 15: return getDeclaredIdentifiers_AndarEsquerda();
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
            case 2: setObject_DecisaoIrPraCelula(declIndex, value); break;
            case 3: setObject_IrPraCelulaACima(declIndex, value); break;
            case 4: setObject_IrPraCelulaBaixo(declIndex, value); break;
            case 5: setObject_IrParaCelulaDireita(declIndex, value); break;
            case 6: setObject_IrPraCelulaEsquerda(declIndex, value); break;
            case 7: setObject_DecisaoBatalhar(declIndex, value); break;
            case 8: setObject_recuperarPokemons(declIndex, value); break;
            case 9: setObject_comprarPokebolas(declIndex, value); break;
            case 10: setObject_BatalhaPerder(declIndex, value); break;
            case 11: setObject_BatalhaGanhar(declIndex, value); break;
            case 12: setObject_AndarCima(declIndex, value); break;
            case 13: setObject_AndarBaixo(declIndex, value); break;
            case 14: setObject_AndarDireita(declIndex, value); break;
            case 15: setObject_AndarEsquerda(declIndex, value); break;
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
            case 2: return getObject_DecisaoIrPraCelula(declIndex);
            case 3: return getObject_IrPraCelulaACima(declIndex);
            case 4: return getObject_IrPraCelulaBaixo(declIndex);
            case 5: return getObject_IrParaCelulaDireita(declIndex);
            case 6: return getObject_IrPraCelulaEsquerda(declIndex);
            case 7: return getObject_DecisaoBatalhar(declIndex);
            case 8: return getObject_recuperarPokemons(declIndex);
            case 9: return getObject_comprarPokebolas(declIndex);
            case 10: return getObject_BatalhaPerder(declIndex);
            case 11: return getObject_BatalhaGanhar(declIndex);
            case 12: return getObject_AndarCima(declIndex);
            case 13: return getObject_AndarBaixo(declIndex);
            case 14: return getObject_AndarDireita(declIndex);
            case 15: return getObject_AndarEsquerda(declIndex);
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
            case 2: return getObjects_DecisaoIrPraCelula();
            case 3: return getObjects_IrPraCelulaACima();
            case 4: return getObjects_IrPraCelulaBaixo();
            case 5: return getObjects_IrParaCelulaDireita();
            case 6: return getObjects_IrPraCelulaEsquerda();
            case 7: return getObjects_DecisaoBatalhar();
            case 8: return getObjects_recuperarPokemons();
            case 9: return getObjects_comprarPokebolas();
            case 10: return getObjects_BatalhaPerder();
            case 11: return getObjects_BatalhaGanhar();
            case 12: return getObjects_AndarCima();
            case 13: return getObjects_AndarBaixo();
            case 14: return getObjects_AndarDireita();
            case 15: return getObjects_AndarEsquerda();
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
            case 2: setObjects_DecisaoIrPraCelula(objects); break;
            case 3: setObjects_IrPraCelulaACima(objects); break;
            case 4: setObjects_IrPraCelulaBaixo(objects); break;
            case 5: setObjects_IrParaCelulaDireita(objects); break;
            case 6: setObjects_IrPraCelulaEsquerda(objects); break;
            case 7: setObjects_DecisaoBatalhar(objects); break;
            case 8: setObjects_recuperarPokemons(objects); break;
            case 9: setObjects_comprarPokebolas(objects); break;
            case 10: setObjects_BatalhaPerder(objects); break;
            case 11: setObjects_BatalhaGanhar(objects); break;
            case 12: setObjects_AndarCima(objects); break;
            case 13: setObjects_AndarBaixo(objects); break;
            case 14: setObjects_AndarDireita(objects); break;
            case 15: setObjects_AndarEsquerda(objects); break;
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
 * @version Jul 6, 2017
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
