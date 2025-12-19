package plugin;

/**
 * @author 4everlynn
 * @version V1.0
 * @date 2020/9/16
 */
public interface Pluggable {
    /**
     * @param plugin target plugin
     * @param <I>    input type
     * @param <O>    output type
     * @return self
     */
    <I, O> Pluggable install(TypePlugin<I, O> plugin);

    /**
     * @param type Plugin Type
     * @param <I>  input type
     * @param <O>  output type
     * @return self
     */
    <I, O> Pluggable uninstall(Class<TypePlugin<I, O>> type);
}
