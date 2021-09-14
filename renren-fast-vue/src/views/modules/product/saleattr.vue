<template>
  <div>
      <base-attr :attrtype="0"></base-attr>
  </div>
</template>

<script>
// 这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
import BaseAttr from './baseattr'
export default {
  // import引入的组件需要注入到对象中才能使用
  components: {BaseAttr},
  props: {},
  data () {
    // 这里存放数据
    return {}
  },
  computed: {},
  // 监控data中的数据变化
  watch: {},
  // 方法集合
  methods: {},
  created () {},
  mounted () {},
  beforeCreate () {},
  beforeMount () {},
  beforeUpdate () {},
  updated () {},
  beforeDestroy () {},
  destroyed () {},
  activated () {}
}
</script>
