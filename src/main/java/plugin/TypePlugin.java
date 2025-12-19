package plugin;

/**
 * @author 4everlynn
 * @version V1.0
 * @date 2020/9/16
 */
public interface TypePlugin<I, O> {

    /**
     * do trans for input -> output
     * use plug-in to avoid data-cannot-parsed
     *
     * @param input input data
     * @return output data
     */
    O doTrans(I input);
}
