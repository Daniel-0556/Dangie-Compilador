// Generated from Dangie.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DangieParser}.
 */
public interface DangieListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DangieParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DangieParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DangieParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DangieParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(DangieParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(DangieParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DangieParser#declaracionVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVar(DangieParser.DeclaracionVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#declaracionVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVar(DangieParser.DeclaracionVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DangieParser#asignacionVar}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionVar(DangieParser.AsignacionVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#asignacionVar}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionVar(DangieParser.AsignacionVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DangieParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(DangieParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(DangieParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DangieParser#confPin}.
	 * @param ctx the parse tree
	 */
	void enterConfPin(DangieParser.ConfPinContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#confPin}.
	 * @param ctx the parse tree
	 */
	void exitConfPin(DangieParser.ConfPinContext ctx);
	/**
	 * Enter a parse tree produced by {@link DangieParser#actuadorPin}.
	 * @param ctx the parse tree
	 */
	void enterActuadorPin(DangieParser.ActuadorPinContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#actuadorPin}.
	 * @param ctx the parse tree
	 */
	void exitActuadorPin(DangieParser.ActuadorPinContext ctx);
	/**
	 * Enter a parse tree produced by {@link DangieParser#lecturaSensor}.
	 * @param ctx the parse tree
	 */
	void enterLecturaSensor(DangieParser.LecturaSensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#lecturaSensor}.
	 * @param ctx the parse tree
	 */
	void exitLecturaSensor(DangieParser.LecturaSensorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DangieParser#bucleWhen}.
	 * @param ctx the parse tree
	 */
	void enterBucleWhen(DangieParser.BucleWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#bucleWhen}.
	 * @param ctx the parse tree
	 */
	void exitBucleWhen(DangieParser.BucleWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DangieParser#bucleLoop}.
	 * @param ctx the parse tree
	 */
	void enterBucleLoop(DangieParser.BucleLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#bucleLoop}.
	 * @param ctx the parse tree
	 */
	void exitBucleLoop(DangieParser.BucleLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DangieParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(DangieParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DangieParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(DangieParser.ExpresionContext ctx);
}