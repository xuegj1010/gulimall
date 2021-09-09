<template>
  <div>
    <el-input placeholder="请输入关键字进行过滤" v-model="filterText"></el-input>
    <el-tree
      :data="menus"
      :props="defaultProps"
      node-key="catId"
      ref="menuTree"
      @node-click="nodeClick"
      :filter-node-method="filterNode"
      :highlight-current="true"
    ></el-tree>
  </div>
</template>

<script>
export default {
  name: 'category',
  data () {
    return {
      filterText: '',
      menus: [],
      defaultProps: {
        children: 'children',
        label: 'name'
      }
    }
  },
  watch: {},
  created () {
    this.getMenus()
  },
  methods: {
    // 树节点过滤
    filterNode (value, data, node) {
      return data.name.indexOf(value) !== -1
    },
    getMenus () {
      this.$http({
        url: this.$http.adornUrl('/product/category/list/tree'),
        method: 'get'
      }).then(({data}) => {
        this.menus = data.data
      })
    },
    nodeClick (data, node, component) {
      // 向父组件发送事件
      this.$emit('tree-node-click', data, node, component)
    }
  }
}
</script>

<style scoped>

</style>
